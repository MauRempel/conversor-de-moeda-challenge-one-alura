# 💱 Conversor de Moedas - Challenge

Este é um conversor de moedas simples desenvolvido em **Java**, que utiliza a **ExchangeRateAPI** para buscar taxas de câmbio em tempo real e converter valores entre diferentes moedas. O projeto faz uso de requisições HTTP modernas e parsing JSON com a biblioteca Gson.

## 🚀 Funcionalidades

- Integração com a ExchangeRateAPI via `HttpClient`
- Conversão entre 6 pares de moedas
- Interface interativa via terminal
- Uso de Gson para manipulação de JSON
- Código limpo, modular e de fácil manutenção

## 💻 Tecnologias e Bibliotecas

- Java 11+
- `java.net.http.HttpClient` para requisições HTTP
- `com.google.gson.Gson` para parsing JSON
- ExchangeRateAPI

## 🔁 Conversões disponíveis

1. USD → BRL (Dólar para Real)  
2. BRL → USD (Real para Dólar)  
3. USD → EUR (Dólar para Euro)  
4. EUR → USD (Euro para Dólar)  
5. BRL → EUR (Real para Euro)  
6. EUR → BRL (Euro para Real)

## 🧪 Como usar

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/Conversor-moedas-Challenge.git
cd Conversor-moedas-Challenge
```

### 2. Adicione sua chave da API

Você deve obter uma chave gratuita em [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/) e incluí-la no código onde a URL da API é montada.

Exemplo:

```java
String apiKey = "SUA_CHAVE_AQUI";
String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/BRL";
```

### 3. Compile e execute

```bash
javac ConversorMoedas.java
java ConversorMoedas
```

Siga as instruções no terminal para escolher a conversão e digitar o valor.



## ✅ Requisitos

- JDK 11 ou superior
- Conexão com a internet
- Chave de API válida da ExchangeRateAPI
- Gson no classpath (você pode usar Maven/Gradle ou incluir o `.jar` manualmente)

