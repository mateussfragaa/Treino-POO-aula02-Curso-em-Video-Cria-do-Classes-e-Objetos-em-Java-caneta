# 🖊️ Sistema de Caneta em Java (POO)

Projeto simples desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando o comportamento de uma caneta.

---

## 🚀 Funcionalidades

- ✔️ Definir cor e tipo de ponta da caneta  
- ✔️ Tampar e destampar a caneta  
- ✔️ Verificar status da caneta  
- ✔️ Simular ação de escrever (rabiscar)  

---

## 🧠 Conceitos aplicados

- Encapsulamento (`private`, getters e setters)
- Métodos com comportamento (ações da caneta)
- Uso de objetos
- Organização em pacotes (`main` e `model`)

---

## 📦 Estrutura do projeto

src/
├── main/
│ └── Main.java
└── model/
└── Caneta.java

---

## 💻 Exemplo de uso

```java
Caneta c1 = new Caneta();

c1.setCor("Azul");
c1.setPonta(0.5);
c1.tampar();

c1.status();
c1.rabiscar();
```

🖥️ Saída esperada (exemplo)

A cor é Azul
A ponta é 0.5
Tampada true
A caneta está tampada

⚙️ Regras implementadas

🖊️ Não é possível rabiscar com a caneta tampada
🖊️ Ao destampar, a caneta pode escrever normalmente
🖊️ O estado da caneta influencia seu comportamento
🎯 Objetivo

Este projeto foi desenvolvido com fins educacionais para praticar conceitos básicos de Programação Orientada a Objetos em Java, especialmente encapsulamento e criação de métodos com lógica.

🧑‍💻 Autor

Mateus Fraga

⭐ Possíveis melhorias
 Definir modelo da caneta no uso
 Adicionar controle de carga (tinta)
 Impedir rabiscar quando a carga estiver zerada
 Melhorar saída com formatação mais detalhada
