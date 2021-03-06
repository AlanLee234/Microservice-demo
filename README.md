# Microservice-demo

本项目是从若依的项目迁移过来的，项目包含完善的系统架构、合理的业务流程和众多有用的功能，因此可以作为初学的微服务（网页开发）项目。

因为原来的ruoyi多面向使用的用户，自己作为作为开发者，期望能在开发的过程中，提供一个可学习和解释性好的项目，以供大家使用。因此经过合并和结构优化，通过添加对学习有用的注释和参考，加入自己的思考，所以产生了这个项目。

同时，考虑到ruoyi中有很多冗杂的功能，并不利于初学者学习相关的知识，因此本人重构了这个微服务项目的demo，期望能提供简洁和可使用的开发框架，可以点击项目[链接](https://github.com/AlanLee234/Microservice-demo.git)查看。

## 平台简介

本项目是一套全部开源的快速开发平台，毫无保留给个人及企业免费使用。

* 采用前后端分离的模式，微服务版本前端。
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。
* 流量控制框架选型Sentinel，分布式事务选型Seata。

## 系统模块

~~~
backend  //后端项目
com   
├── gateway         // 网关模块 [8080]
├── auth            // 认证中心 [9200]
├── api             // 接口模块
│       └── api-system                          // 系统接口
├── common          // 通用模块
│       └── common-core                         // 核心模块
│       └── common-datascope                    // 权限范围
│       └── common-datasource                   // 多数据源
│       └── common-log                          // 日志记录
│       └── common-redis                        // 缓存服务
│       └── common-security                     // 安全模块
│       └── common-swagger                      // 系统接口
├── modules         // 业务模块
│       └── system                              // 系统模块 [9201]
│       └── gen                                 // 代码生成 [9202]
│       └── job                                 // 定时任务 [9203]
│       └── file                                // 文件服务 [9300]
├── visual          // 图形化管理模块
│       └── visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖

frontend  //前端项目
├── ui              // 前端框架 [80]
~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-82e9722ecb846786405a904bafcf19f73f3.png"/>

## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。



