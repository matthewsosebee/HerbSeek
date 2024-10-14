-- Table: public.datarepo

-- DROP TABLE IF EXISTS public.datarepo;

CREATE TABLE IF NOT EXISTS public.datarepo
(
    id bigint NOT NULL,
    date character varying(255) COLLATE pg_catalog.'default',
    lat character varying(255) COLLATE pg_catalog.'default',
    lng character varying(255) COLLATE pg_catalog.'default',
    name character varying(255) COLLATE pg_catalog.'default',
    note character varying(255) COLLATE pg_catalog.'default'
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.datarepo
    OWNER to postgres;

INSERT INTO public.datarepo VALUES (1, '2024-04-30', '36.612270', '-81.925430', 'Goldenrod', 'Default - Goldenrod');
INSERT INTO public.datarepo VALUES (2, '2024-04-30', '36.612270', '-81.925430', 'Skullcap', 'Default - Skullcap');
INSERT INTO public.datarepo VALUES (3, '2024-04-30', '36.612270', '-81.925430', 'Skullcap', 'Default - Mugwort');