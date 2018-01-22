-- auto-generated definition
CREATE TABLE student
(
  id    INT AUTO_INCREMENT
    PRIMARY KEY,
  name  VARCHAR(45)  NULL,
  marks INT          NULL,
  url   VARCHAR(255) NULL,
  CONSTRAINT idstudent_UNIQUE
  UNIQUE (id)
)
  ENGINE = InnoDB;

