--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `orderdb`.`order_details` DROP PRIMARY KEY;

DROP TABLE `orderdb`.`hibernate_sequence`;

DROP TABLE `orderdb`.`order_details`;

CREATE TABLE `orderdb`.`hibernate_sequence` (
	`next_val` BIGINT
);

CREATE TABLE `orderdb`.`order_details` (
	`id` BIGINT NOT NULL,
	`total_amount` BIGINT,
	`order_date` DATETIME,
	`status` VARCHAR(255),
	`product_id` BIGINT,
	`quantity` BIGINT,
	PRIMARY KEY (`id`)
);

