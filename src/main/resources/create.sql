CREATE DATABASE springboot;
use springboot;

DROP TABLE IF EXISTS `Person`;

CREATE TABLE `Person` (
                          `id` int unsigned NOT NULL auto_increment,
                          `lastname` varchar(50) default NULL,
                          `firstname` varchar(50) default NULL,
                          PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;