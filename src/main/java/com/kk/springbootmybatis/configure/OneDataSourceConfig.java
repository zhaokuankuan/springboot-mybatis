package com.kk.springbootmybatis.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author Mr.kk
 */
@Configuration
@MapperScan(basePackages = "com.kk.springbootmybatis.dao.one", sqlSessionTemplateRef  = "oneSqlSessionTemplate")
public class OneDataSourceConfig {

    //创建一个SqlSessionFactory，并且将数据源注入其中
    @Bean(name = "oneSqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("OneDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
        return bean.getObject();
    }

    //同时将数据源添加到事务中
    @Bean(name = "oneTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("OneDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    //将上面创建的SqlSessionFactory注入，创建在 Mapper 中需要使用的SqlSessionTemplate
    @Bean(name = "oneSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("oneSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
