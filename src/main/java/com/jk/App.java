package com.jk;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 启动类
 * @SpringBootApplication指定这是一个springboot的应用程序
 */
//extends WebMvcConfigurerAdapter
@SpringBootApplication
public class App
{

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//
//        /**
//         * 1.需要先定义一个convert 转换消息的对象
//         * 2.添加fastJson的配置信息，比如是否要格式化返回的json数据
//         * 3.在convert中添加配置信息
//         * 4.将convert添加到converts当中
//         */
//        //1.定义一个convert 转换消息的对象
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//
//        //2.添加fastJson的配置信息
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//
//        //是否要格式化返回的json数据
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//
//        //处理乱码
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);
//
//        //3.在convert中添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//
//        //4.将convert添加到converts当中
//        converters.add(fastConverter);
//    }

    /**
     * 我们使用@Bean进行注入fastJsonHttpMessageConverters
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        //1.定义一个convert 转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2.添加fastJson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //是否要格式化返回的json数据
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);

        //处理乱码
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);

        //4.
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

    public static void main( String[] args )
    {
        /**
         * 在main方法中启动我们的应用程序
         */
        SpringApplication.run(App.class,args);
    }
}
