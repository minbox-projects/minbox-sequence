# minbox-sequence
分布式ID生成服务，提供核心功能。

## Leaf

基于 Leaf 提供两种生成的ID的方式（号段模式和snowflake模式）

### 号段模式

需要建立 DB 表，并配置 jdbc.url, jdbc.username, jdbc.password

**创建数据库**

```mysql
CREATE DATABASE leaf;
CREATE TABLE `leaf_alloc` (
  `biz_tag` varchar(128)  NOT NULL DEFAULT '',
  `max_id` bigint(20) NOT NULL DEFAULT '1',
  `step` int(11) NOT NULL,
  `description` varchar(256)  DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`biz_tag`)
) ENGINE=InnoDB;

insert into leaf_alloc(biz_tag, max_id, step, description) values('leaf-segment-test', 1, 2000, 'Test leaf Segment Mode Get Id');
```

单元测试 IDGenServiceTest



## SnawflakeGen 本地雪花

创建 SnawflakeGen 对象即可，最好使用单例模式。

**配置 zookeeper 地址**

该模式需要依赖 zookeeper

```properties
snawflake.name=default
zk.list=127.0.0.1:2181
snowflake.port=8688
```

