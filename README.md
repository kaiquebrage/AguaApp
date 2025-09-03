# 💧 ÁguApp – Dimensionamento de Reservatórios Prediais

Aplicativo Android para cálculo automático de **dimensionamento de reservatórios de água fria predial**, seguindo a norma **NBR 5626**. Voltado para engenheiros, arquitetos e técnicos de instalações hidráulicas.

---

## 📱 Funcionalidades

- Entrada de dados do projeto hidráulico:
  - Número de moradores (residentes + empregado(a))
  - Apartamentos por andar
  - Quantidade de pavimentos
  - Vagas de garagem
  - Área do jardim
  - Existência e número de lavanderias

- Cálculo automático de:
  - **Consumo total de água com reserva (CTRA)**
  - **Reservatório Inferior**
  - **Reservatório Superior com reserva técnica para combate a incêndios**

- Interface simples e direta para Android

---

## 📷 Tela do Aplicativo

Exemplo de interface do ÁguApp em execução:

<img width="284" height="494" alt="screenshot-tela" src="https://github.com/user-attachments/assets/fd034b58-9dc2-43a3-9e6f-5b98561fd3e4" />
<img width="330" height="494" alt="screenshot-tela2" src="https://github.com/user-attachments/assets/9e60815f-1a66-4cdd-8def-1dbc361cb286" />

---

## 🧮 Fórmulas Utilizadas

| Fórmula                        | Descrição                                                    |
|-------------------------------|--------------------------------------------------------------|
| Consumo da construção (C)      | (200 × nº pessoas) + (50 × nº carros) + (1,5 × área jardim) + (80 × nº lavanderias) |
| Consumo Total c/ Reservação (CTRA) | C × 2                                                      |
| Reserva de Incêndio            | CTRA × 0,2                                                  |
| Reservatório Inferior          | CTRA × 0,6                                                  |
| Reservatório Superior          | (CTRA × 0,4) + (CTRA × 0,2)                                |

---

## 🛠️ Tecnologias Utilizadas

- **Java** (Android SDK)
- **Android** Studio
- **XML** (Interface Layout)
- Componentes nativos: (`<EditText>`, `<TextView>`, `<CheckBox>`, `<Button>`).
  
---

## 🗂️ Estrutura do Repositório

  ├── app/
│   ├── java/com/example/aguapp/
│   │   └── AguappActivity.java      # Lógica do cálculo
│   └── res/layout/
│       └── activity_aguapp.xml      # Layout da interface
├── AndroidManifest.xml
└── README.md

---

## 👥 Autores

- João Henrique
- Kaique Bragé
