
package com.transunion.transunion.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 *
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pokemonPaginated" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pokemonPaginated"
})
@XmlRootElement(name = "GetPokemonResponse", namespace = "http://example.com/pokemon")
public class GetPokemonResponse {

    @XmlElement(required = true)
    protected String pokemonPaginated;

    /**
     * Obtiene el valor de la propiedad pokemonPaginated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPokemonPaginated() {
        return pokemonPaginated;
    }

    /**
     * Define el valor de la propiedad pokemonPaginated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPokemonPaginated(String value) {
        this.pokemonPaginated = value;
    }

}
