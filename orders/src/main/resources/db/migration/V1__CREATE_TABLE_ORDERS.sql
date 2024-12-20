CREATE TABLE tb_orders (

    id VARCHAR(36) PRIMARY KEY NOT NULL,
    user_id BIGINT NOT NULL,
    status SMALLINT NOT NULL CHECK (status BETWEEN 1 and 3)
);

CREATE TABLE tb_items(

    order_id VARCHAR(36) NOT NULL,
    item_id BIGINT,
    price FLOAT(53),
    amount INTEGER,
    partial_amount FLOAT(53),
    CONSTRAINT fk_order_items FOREIGN KEY (order_id) REFERENCES tb_orders(id)
);