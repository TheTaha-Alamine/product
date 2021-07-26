CREATE TABLE base_product
(
    id       serial primary key,
    document jsonb NOT NULL
);

CREATE INDEX idx_base_product_base_product_no ON base_product USING btree ((document ->> 'base_product_no'));