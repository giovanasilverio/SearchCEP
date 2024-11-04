# 📦 Projeto de Consulta de CEP

Este é um projeto em Java para realizar consultas de CEP, trazendo informações como logradouro, bairro, cidade e estado com base em um CEP informado.

## 📋 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Exemplo de Uso](#exemplo-de-uso)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de facilitar a obtenção de informações de endereço a partir de um CEP no Brasil. Ideal para sistemas que necessitam de validação ou preenchimento automático de endereço.

## Funcionalidades

- 🔍 **Busca por CEP:** Realiza consultas através de um serviço de API para trazer os dados completos de um endereço.
- 🗺️ **Informações detalhadas:** Exibe logradouro, bairro, cidade, estado e outras informações relevantes.
- ⚡ **Interface Simples:** Sistema fácil de usar com resposta rápida.

## Tecnologias Utilizadas

- **Java 11+**
- **API ViaCEP** 

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seuusuario/projeto-cep.git
   ```
2. **Navegue até o diretório do projeto**:
   ```bash
   cd projeto-cep
   ```
3. **Compile o projeto**:
   ```bash
   javac -d bin src/*.java
   ```
4. **Execute o projeto**:
   ```bash
   java -cp bin Main
   ```

## Exemplo de Uso

Digite o CEP desejado e receba as informações completas do endereço em um arquivo:

```java
Digite o CEP: 01001-000
Resultado:
Logradouro: Praça da Sé
CEP:
Complemento: 
Bairro: Sé
Localidade: São Paulo
UF: SP
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto e abrir pull requests com melhorias ou novas funcionalidades.

1. Faça um fork do projeto.
2. Crie uma nova branch: `git checkout -b minha-feature`
3. Commit suas mudanças: `git commit -m 'Adiciona nova funcionalidade'`
4. Push a branch: `git push origin minha-feature`
5. Abra um Pull Request.

## Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

