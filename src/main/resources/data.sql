INSERT INTO CLIENTE(NOME, CNPJ, ENDERECO, DATA)
VALUES
('Jack',    '11.111.111/0001-11', 'Rua a, Numero 1', '13/06/2022'),
('Abigail', '22.222.222/0001-22', 'Rua b, Numero 2', '01/01/2022'),
('John',    '33.333.333/0001-33', 'Rua c, Numero 3', '12/06/2022');

INSERT INTO CHAMADO(CLIENTE_ID, ASSUNTO, STATUS, COMPLEMENTO, DATA)
VALUES
(1, 'SUPORTE',    'EM_ABERTO',    'Estou com problema na plataforma.', '13/06/2022'),
(2, 'FINANCEIRO', 'EM_PROGRESSO', 'Meu pagamento não foi efetuado.',   '04/03/2022'),
(3, 'VISITA',     'ATENDIDO',     'Desejo marcar uma visita.',         '14/06/2022');

INSERT INTO USUARIO(ID, NOME, FOTO)
VALUES
('30egs6X6TiV13EQaoIWSGbWVFg52', 'Teste', null);
