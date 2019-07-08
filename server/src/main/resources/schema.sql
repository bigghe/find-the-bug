DROP TABLE IF EXISTS public."beer";
DROP TABLE IF EXISTS public."brewery";

CREATE TABLE public."brewery" (
	id int4 NOT NULL,
	"name" varchar(255) NULL,
	"description" varchar(255) NULL,
	"url_image" varchar(500) NULL
);

CREATE TABLE public."beer" (
	id int4 NOT NULL,
	"name" varchar(255) NULL,
	"description" varchar(255) NULL,
	"url_image" varchar(500) NULL,
	"type" varchar(255) NULL,
	id_brewery int4 NULL
);
