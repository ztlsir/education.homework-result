-- 创建homework数据库
CREATE DATABASE homework_result DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

go

use homework_result

go

-- 创建homeworks表
CREATE TABLE HomeworkResults
(
  ID           VARCHAR(64) NOT NULL,
  JSON_CONTENT JSON        NOT NULL,
  STATUS       VARCHAR(10) GENERATED ALWAYS AS (JSON_CONTENT ->> '$.status') VIRTUAL,
  PRIMARY KEY (ID)
) CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
