# bpm-platform

bpm platform based flowable

由于 `flowable` 是开源框架考虑情况比较多，而我们定制化开发的时候，考虑的情况相对较少
在此参考 框架源码工程 `flowable-engine` 进行定制化开发。

由于尚未集成单点登录，故将项目部署在同一个容器中进行权限验证。。。

- bpm-platform
   - [x] bpm-platform-idm -- 授权
   - [x] bpm-platform-modeler -- 在线设计器
   - [ ] bpm-platform-admin -- 流程管理
   - [ ] bpm-platform-task -- 任务管理
   - [ ] bpm-platform-rest -- 流程提供


## reference & recommend
- [flowable-engine](https://github.com/flowable/flowable-engine)
