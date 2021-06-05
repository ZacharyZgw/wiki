如果出现405错误，表示不支持该类请求方法  
比图controller是get请求，url用的是post请求  
在启动类使用了@Springbootapplication注解，则会默认该类所在的包以及子包下的bean  
如果启动类不在classpath路径下，使用@ComponentScan指定扫描的包  
