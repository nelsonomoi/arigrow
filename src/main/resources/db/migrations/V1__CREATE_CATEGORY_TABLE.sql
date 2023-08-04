
CREATE TABLE IF NOT EXISTS CATEGORY(
    id bigint generated always as identity primary key ,
    name varchar(50),
    description varchar(255),
    create_at timestamp,
    created_by varchar(50),
    updated_at timestamp,
    updated_by varchar(50)
);