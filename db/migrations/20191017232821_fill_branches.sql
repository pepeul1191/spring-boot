-- migrate:up

INSERT INTO branches (id, name, address, phone, whatsapp, emergency, image, latitude, longitude, branch_type_id, director_id) VALUES
(1, "CENTRAL (JUAN DE ARONA)", "AV. JUAN DE ARONA 425", "421-6323", "", "", "assets/img/default-branch.png", -12, -77, 1, 41), (3, "BARRANCO", "JR. ALFONSO UGARTE 250", "247-6892", "", "", "assets/img/default-branch.png", -12, -77, 1, 198), (4, "CALLAO", "AV. GUARDIA CHALACA 1362", "453-3276", "", "", "assets/img/default-branch.png", -12, -77, 1, 154), (5, "COMAS", "AV. EL MAESTRO PERUANO 430", "535-8144", "", "", "assets/img/default-branch.png", -11, -77, 1, 399), (6, "JESUS MARIA", "JR. HUIRACOCHA 1486", "424-1443", "", "", "assets/img/default-branch.png", -12, -77, 1, 216), (7, "LA MOLINA", "CALLE SANTA MAGDALENA SOFIA 109", "436-2883", "", "", "assets/img/default-branch.png", -12, -76, 1, 69), (8, "LA VICTORIA", "JR. JUAN VOTO BERNALES 399 - SANTA CATALINA", "471-3998", "", "", "assets/img/default-branch.png", -12, -77, 1, 1), (9, "LIMA CENTRO", "JR. CAMANA 780 PISO 5", "427-0158", "", "", "assets/img/default-branch.png", -12, -77, 1, 118), (10, "LOS OLIVOS", "AV. CARLOS IZAGUIRRE 1268", "232 0420", "", "", "assets/img/default-branch.png", -11, -77, 1, 91), (11, "PUEBLO LIBRE", "AV. PABLO FERNANDINI 1573", "330-7492", "", "", "assets/img/default-branch.png", -12, -77, 1, 394), (13, "SAN BORJA 1", "AV. JOAQUIN MADRID 235", "225-0809", "", "", "assets/img/default-branch.png", -12, -77, 1, 136), (15, "SAN JUAN DE LURIGANCHO", "CALLE LAS CHULPAS 296 OFIC. 201-202 - ZÁRATE", "458-6472", "", "", "assets/img/default-branch.png", -11, -77, 1, 96), (16, "SAN JUAN DE MIRAFLORES", "AV. GUILLERMO BILLINGHURST 619", "466-1128", "", "", "assets/img/default-branch.png", -12, -76, 1, 1), (17, "SAN MIGUEL 1", "CALLE MONSEÑOR JORGE DINTILHAC 717 ", "451-5553", "", "", "assets/img/default-branch.png", -12, -77, 1, 123), (18, "SURCO", "CALLE MONSERRATE ESTE 208", "275-4687", "", "", "assets/img/default-branch.png", -12, -77, 1, 105), (19, "SURQUILLO", "CALLE LAS TIENDAS 331 DPTO. 101", "440-1021", "", "", "assets/img/default-branch.png", -12, -77, 1, 178), (20, "AREQUIPA", "CALLE SEVILLA Nº 107 URB. LOS SAUCES - CAYMA", "(054) 272716", "", "", "assets/img/default-branch.png", -16, -71, 2, 271), (22, "CAJAMARCA", "AV. DOS DE MAYO N°360", "(076) 369456", "", "", "assets/img/default-branch.png", -7, -78, 2, 220), (24, "CHICLAYO", "CALLE MANUEL MARIA IZAGA N°778", "(074) 223877", "", "", "assets/img/default-branch.png", -6, -79, 2, 230), (25, "CUSCO", "CALLE ABRAHAM VALDELOMAR  A-17 - WANCHAQ", "(084) 262020", "", "", "assets/img/default-branch.png", -13, -71, 2, 472), (26, "HUANCAYO", "JR. ANCASH N°231", "(064) 211004", "", "", "assets/img/default-branch.png", -12, -75, 2, 247), (27, "HUARAZ", "JR. JUAN BAUTISTA MEJÍA N°858", "(043) 425135", "", "", "assets/img/default-branch.png", -9, -77, 2, 407), (28, "ICA", "CALLE DOMINGO ELIAS 129 URB. LUREN", "(056) 216345", "", "", "assets/img/default-branch.png", -14, -75, 2, 281), (29, "JULIACA", "JR. PIURA N°482 PARQUE GRAU", "(051) 325462", "", "", "assets/img/default-branch.png", -15, -70, 2, 279), (30, "MOQUEGUA", "URB. EL HUAYCO MZ. D - LOTE 1, MARISCAL NIETO", "(053) 463446", "", "", "assets/img/default-branch.png", -16, -70, 2, 293), (31, "PIURA", "AV. GRAU N°1050 URB. CLUB GRAU", "(073) 305820", "", "", "assets/img/default-branch.png", -5, -80, 2, 228), (32, "PUCALLPA", "JR. ATAHUALPA 139. CALLERIA - CORONEL PORTILLO", "(061) 573075", "", "", "assets/img/default-branch.png", -8, -74, 2, 256), (33, "PUNO", "JR. DEUSTUA N°754", "(051) 366390", "", "", "assets/img/default-branch.png", -15, -70, 2, 253), (34, "TACNA", "AV. BILLINGHURST  N°358", "(052) 413136", "", "", "assets/img/default-branch.png", -18, -70, 2, 289), (35, "TARAPOTO", "JR. RICARDO PALMA N°262", "(042) 520016", "", "", "assets/img/default-branch.png", -6, -76, 2, 419), (36, "TRUJILLO", "CALLE SANTA URSULA N°109 URB. LA MERCED", "(044) 286921", "", "", "assets/img/default-branch.png", -8, -79, 2, 240), (37, "TUMBES", "CALLE LOS ANDES N°121", "(072) 522771", "", "", "assets/img/default-branch.png", -3, -80, 2, 285), (42, "MIRAFLORES", "AV. REP DE PANAMA Nº 5806 URB. SAN ANTONIO", "447-5190", "", "", "assets/img/default-branch.png", -12, -77, 1, 151), (43, "JAVIER PRADO", "AV. JAVIER PRADO ESTE  1692 - SAN ISIDRO", "475-1719", "", "", "assets/img/default-branch.png", -12, -77, 1, 317), (46, "SAN MIGUEL 2", "CALLE AYARSA DE MORALES 237, URB. EL CAMPILLO", "636-1105", "", "", "assets/img/default-branch.png", -12, -77, 1, 487), (47, "SAN BORJA 2", "AV. PRIMAVERA 643 OF. 503 URB. CHACARILLA DEL ESTANQUE ", "648-0253", "", "", "assets/img/default-branch.png", -12, -76, 1, 561)


-- migrate:down

TRUNCATE branches;