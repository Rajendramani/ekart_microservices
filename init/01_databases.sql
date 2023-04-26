# create databases
CREATE DATABASE IF NOT EXISTS `orderdb`;
CREATE DATABASE IF NOT EXISTS `paymentdb`;
CREATE DATABASE IF NOT EXISTS `productdb`;

# create root user and grant rights
CREATE USER 'root'@'localhost' IDENTIFIED BY 'local';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';