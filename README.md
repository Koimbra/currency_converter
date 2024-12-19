# README - Currency Converter

## Descrição

Este é um projeto simples de **conversão de moedas** desenvolvido em **Java**. Ele permite que o usuário converta entre diferentes moedas, como **dólar**, **pesos argentinos**, **reais brasileiros** e **pesos colombianos**. O projeto busca utilizar taxas de câmbio em tempo real através da API Exchange Rate-API, permitindo que as conversões sejam realizadas com base em valores atualizados.

## Funcionalidades

- O usuário pode escolher entre diferentes tipos de conversão de moeda, como:
  - **Dólar para Peso Argentino**
  - **Peso Argentino para Dólar**
  - **Dólar para Real Brasileiro**
  - **Real Brasileiro para Dólar**
  - **Dólar para Peso Colombiano**
  - **Peso Colombiano para Dólar**
  - **Escolher outras moedas para conversão personalizada**
  
- O código permite a interação com o usuário através de um **menu** interativo, e a conversão é feita automaticamente após a escolha da opção.

- O projeto utiliza uma **API de câmbio** para obter as taxas de conversão em tempo real, garantindo que as informações estejam sempre atualizadas.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada para o desenvolvimento.
- **API de Câmbio**: Usada para buscar as taxas de conversão atualizadas.
- **Gson**: Biblioteca para manipulação de dados JSON, que é utilizada para processar a resposta da API.
- **HttpClient**: Classe para gerenciar comunicação via HTTP.

## Estrutura do Código

O código é composto por quatro classes principais:

1. **Menu**: Responsável por exibir o menu interativo para o usuário e coletar a opção escolhida.
2. **Conversion**: Faz a conversão entre as moedas, utilizando a API externa para obter as taxas de câmbio e realizando o cálculo da conversão.
3. **Calculator**: Realiza o cálculo da conversão monetária, multiplicando o valor fornecido pela taxa de câmbio.
4. **Currency**: Representa a estrutura de dados que contém as informações sobre as taxas de câmbio e o código da moeda base.
5. **Main**: A classe principal que inicializa o programa e executa o processo de conversão.

## Como Usar

1. **Clone o repositório**:
   - Faça o download do projeto ou clone o repositório em seu ambiente de desenvolvimento local.
   
2. **Execute o programa**:
   - No terminal, navegue até a pasta do projeto e execute a classe `Main` para iniciar o menu de conversão.
   
3. **Interaja com o menu**:
   - Escolha uma das opções de conversão de moeda e forneça o valor a ser convertido.

4. **Veja o resultado**:
   - O programa calculará e mostrará o valor convertido de acordo com a taxa de câmbio obtida da API.

## Exemplo de Execução

```
******** WELCOME TO THE CURRENCY CONVERTER ********
___________________________________________________
Select the currency you want to convert:
[1] - Dollar >>> Argentine peso
[2] - Argentine peso >>> Dollar
[3] - Dollar >>> Brazilian real
[4] - Brazilian real >>> Dollar
[5] - Dollar >>> Colombian peso
[6] - Colombian peso >>> Dollar
[7] - Choose currencies for conversion
[8] - Exit
```

O programa vai solicitar que você insira um valor e, em seguida, fornecerá o resultado da conversão.

## Observações

- **API Key**: A chave de acesso para a API de câmbio está hardcoded no código (não é recomendável em produção). Caso queira usar uma chave própria, basta substituir o valor da variável `api_key`.
  
- **Códigos das Moedas**: As moedas são representadas por seus códigos padrão, como "USD" para dólar, "BRL" para real brasileiro, "ARS" para peso argentino, etc.

## Por que está escrito em Inglês?

Embora o código do projeto esteja inteiramente em **inglês**, ele foi escrito dessa forma com o objetivo de treinar a familiaridade com a linguagem utilizada no mercado de trabalho, onde o inglês é predominante.

