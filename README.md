# ChatOnline
刘鹏：
数据库：MySQL
数据库连接：
    resources:
        spring-dao.xml 数据库源
        applicationContext.xml spring容器
        mybatis-config.xml mybatis配置信息（无内容）
        Mapper:
            UserMapper.xml 从数据库获取信息
pojo:
    user.java 用户实体
dao:
    Impl：
        UserDaoImpl(java) 用户实例
    UserDao(In):用户接口
service:

controller
