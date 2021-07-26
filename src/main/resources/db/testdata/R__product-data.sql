DELETE FROM base_product WHERE id IN (111111, 222222);

INSERT INTO base_product(id, document)  VALUES (111111, '{
  "base_product_no": "111111",
  "name": {
    "short": "OMO",
    "long": "OMO Matic"
  },
  "status": "SELLABLE",
  "created": "2016-08-10T11:54:02+02:00"
}'
);

INSERT INTO base_product(id, document)  VALUES (222222, '{
  "base_product_no": "222222",
  "name": {
    "short": "PS4",
    "long": "Play Station 4"
  },
  "status": "SELLABLE",
  "created": "2016-08-10T11:54:02+02:00"
}'
                                               );