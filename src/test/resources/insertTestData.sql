CREATE TABLE IF NOT EXISTS ACCOUNT(
	user VARCHAR (255) NOT NULL	PRIMARY KEY,
	password VARCHAR (255) NOT NULL
);

DELETE FROM ACCOUNT;

INSERT INTO ACCOUNT(user,password) VALUES ('user1','password1');
INSERT INTO ACCOUNT(user,password) VALUES ('user2','password2');
INSERT INTO ACCOUNT(user,password) VALUES ('user3','password3');

