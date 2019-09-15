# -SpringBootMVC

### MyBatis-Plus最基本应用  
1.引入依赖（mvn）：  
		`<dependency>  
    		<groupId>org.apache.commons</groupId>  
    		<artifactId>commons-lang3</artifactId>  
    		<version>3.9</version>  
		</dependency>`  
2.建一个自己的Mapper 接口，如AccountMapper， 继承Mybatis-plus的BaseMapper<Account>接口  
3.建一个自己的Service 接口，如AccountService，继承IService<Account>接口  
4.建立AccountService的实现类AccountServiceImpl，同时这个实现类要继承ServiceImpl<BaseMapper<Account>, Account> （注：ServiceImpl其实也实现了IService接口.实现AccountSerrvice是为了灵活添加自定义方法，后面Controller依赖注入的是AccountSerrvice的对象，而不是ServiceImpl或者IService的对象。整个继承链是个“菱形继承”）  
5.为AccountServiceImpl添加@Service注解，以便Springboot启动的时候依赖注入  
6.Springboot启动类中添加@MapperScan注解，以便其扫描到Mapper接口然后由代理自动生成具体的实现类  
7.以@Autowired注解的方式把一个AccountService类的对象依赖注入到Controller中  
8.最后在Controller里就可以享受AccountService的各种代码了，无需为基本功能写任何代码，也无须实例化任何对象，与Spring JPA和MyBatis一样，最大程度上面向接口编程  

https://mp.baomidou.com/guide/quick-start.html  