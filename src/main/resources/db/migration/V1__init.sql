CREATE TABLE `interaction_text` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `text` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `interaction_id` bigint NOT NULL,
    PRIMARY KEY (`id`),
    KEY `FKjccd5qqdgownlh9y403boceok` (`interaction_id`),
    CONSTRAINT `FKjccd5qqdgownlh9y403boceok` FOREIGN KEY (`interaction_id`) REFERENCES `interactions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=804 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `interactions` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `image` mediumblob,
    `keyword` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `psy_center` (
    `psy_center_no` int NOT NULL AUTO_INCREMENT,
    `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
    `description` text COLLATE utf8mb4_general_ci NOT NULL,
    `logo` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `method` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `subject` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `time` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `category` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `link` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `info_description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`psy_center_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `psy_info` (
    `psy_info_no` int NOT NULL AUTO_INCREMENT,
    `title` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
    `content` text COLLATE utf8mb4_general_ci NOT NULL,
    `image` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `contents` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`psy_info_no`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `psy_test` (
    `psy_test_no` int NOT NULL AUTO_INCREMENT,
    `title` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
    `content` text COLLATE utf8mb4_general_ci NOT NULL,
    `target` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `time` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `psy_test_type_no` bigint DEFAULT NULL,
    `samyook` tinyint(1) DEFAULT NULL, PRIMARY KEY (`psy_test_no`),
    KEY `FK9es1klwnku4s8w97s0wf4rkj3` (`psy_test_type_no`),
    CONSTRAINT `FK9es1klwnku4s8w97s0wf4rkj3` FOREIGN KEY (`psy_test_type_no`) REFERENCES `psy_test_type` (`psy_test_type_no`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `psy_test_type` (
    `psy_test_type_no` bigint NOT NULL AUTO_INCREMENT,
    `title` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`psy_test_type_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

