# Pokémon SOAP Service

Este proyecto es un servicio SOAP que expone un endpoint para obtener información sobre Pokémon. El servicio permite consultar los detalles de un Pokémon basándose en una solicitud SOAP.

## Características

- **Tecnología**: El servicio está implementado utilizando Spring Boot y Spring Web Services (SOAP).
- **Operación principal**: Consulta de detalles de Pokémon mediante solicitudes SOAP.
- **Namespace**: `http://example.com/pokemon`
- **Endpoint**: `/ws/pokemon`

## Estructura de Carpetas

- `src/main/java/com/transunion/transunion/soap/`: Contiene la clase `PokemonEndpoint` que maneja las solicitudes SOAP.
- `src/main/java/com/transunion/transunion/config/`: Contiene la clase de configuración `PokemonServiceConfig`, que configura el servicio web SOAP.
- `src/main/resources/`: Contiene los archivos de configuración y el esquema WSDL del servicio.

## Cómo Ejecutar el Servicio

### Requisitos Previos

- **JDK 17** o superior.
- **Maven** para compilar y gestionar las dependencias.
- **Spring Boot** (usado como marco principal).
- **SOAP UI** o cualquier otra herramienta cliente SOAP para realizar pruebas.

### Pasos para Ejecutar

1. **Clonar el Repositorio**

   Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/CDanilo23/transunion.git
2. limpiar y compila:
   ```bash
   mvn clean install
   
3. inicia el servicio usando maven:
   ```bash
   mvn spring-boot:run 

El servidor SOAP estará disponible en 
    ```
    http://localhost:8080/ws
    ```

Cómo Realizar una Solicitud SOAP

1. Abrir SOAP UI o Herramienta Similar

2. Utiliza una herramienta como SOAP UI para realizar la solicitud SOAP.

3. Cargar el WSDL

4. Importa el siguiente archivo WSDL para configurar tu cliente SOAP o desde el request agrega la url:

    ```bash
    http://localhost:8080/ws/pokemon.wsdl
Ejemplo de Solicitud SOAP

A continuación, un ejemplo de solicitud SOAP de manera correcta

    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tns="http://example.com/pokemon">
        <soapenv:Header/>
        <soapenv:Body>
            <tns:GetPokemonRequest>
                <tns:offset>1</tns:offset>
                <tns:limit>10</tns:limit>
            </tns:GetPokemonRequest>
        </soapenv:Body>
    </soapenv:Envelope>
Ejemplo de Respuesta SOAP

El servicio responderá

    <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns3:GetPokemonResponse xmlns:ns3="http://example.com/pokemon">
            <pokemonPaginated>{"count":1302,"next":"https://pokeapi.co/api/v2/pokemon?offset=20&amp;limit=20","previous":null,"results":[{"name":"bulbasaur","url":"https://pokeapi.co/api/v2/pokemon/1/"},{"name":"ivysaur","url":"https://pokeapi.co/api/v2/pokemon/2/"},{"name":"venusaur","url":"https://pokeapi.co/api/v2/pokemon/3/"},{"name":"charmander","url":"https://pokeapi.co/api/v2/pokemon/4/"},{"name":"charmeleon","url":"https://pokeapi.co/api/v2/pokemon/5/"},{"name":"charizard","url":"https://pokeapi.co/api/v2/pokemon/6/"},{"name":"squirtle","url":"https://pokeapi.co/api/v2/pokemon/7/"},{"name":"wartortle","url":"https://pokeapi.co/api/v2/pokemon/8/"},{"name":"blastoise","url":"https://pokeapi.co/api/v2/pokemon/9/"},{"name":"caterpie","url":"https://pokeapi.co/api/v2/pokemon/10/"},{"name":"metapod","url":"https://pokeapi.co/api/v2/pokemon/11/"},{"name":"butterfree","url":"https://pokeapi.co/api/v2/pokemon/12/"},{"name":"weedle","url":"https://pokeapi.co/api/v2/pokemon/13/"},{"name":"kakuna","url":"https://pokeapi.co/api/v2/pokemon/14/"},{"name":"beedrill","url":"https://pokeapi.co/api/v2/pokemon/15/"},{"name":"pidgey","url":"https://pokeapi.co/api/v2/pokemon/16/"},{"name":"pidgeotto","url":"https://pokeapi.co/api/v2/pokemon/17/"},{"name":"pidgeot","url":"https://pokeapi.co/api/v2/pokemon/18/"},{"name":"rattata","url":"https://pokeapi.co/api/v2/pokemon/19/"},{"name":"raticate","url":"https://pokeapi.co/api/v2/pokemon/20/"}]}</pokemonPaginated>
        </ns3:GetPokemonResponse>
    </SOAP-ENV:Body>
    </SOAP-ENV:Envelope>