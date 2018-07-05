![Build Status](https://www.travis-ci.org/looper123/my-disconfig.svg?branch=master) 
![license](https://img.shields.io/badge/license-Apache--2.0-green.svg)
[![Coverage Status](https://coveralls.io/repos/github/looper123/my-disconfig/badge.svg)](https://coveralls.io/github/looper123/my-disconfig)
![release](https://img.shields.io/github/release/looper123/my-disconfig.svg)

### 环境搭建
- 参考 http://disconf.readthedocs.io/zh_CN/latest/install/src/01.html
### 
### note
- 如果启动时遇到zk连接报错（由 ResilientActiveKeyValueStore类报出 ）
可能原因是 你部署的disconf-web 项目 profile/rd/zoo.properties 中的 hosts属性设置成了localhost:2181
或者127.0.0.1:2181 当你从本地启动项目时会从hosts连接zk 而本地没有安装zk
