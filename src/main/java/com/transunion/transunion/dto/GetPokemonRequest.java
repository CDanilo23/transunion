
package com.transunion.transunion.dto;

import jakarta.xml.bind.annotation.*;


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
 *         &amp;lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPokemonRequest", propOrder = {
    "offset",
    "limit"
})
@XmlRootElement(name = "GetPokemonRequest", namespace = "http://example.com/pokemon")
public class GetPokemonRequest {
    @XmlElement(required = true, nillable = true)
    protected int offset;
    @XmlElement(required = true, nillable = true)
    protected int limit;

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Obtiene el valor de la propiedad limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Define el valor de la propiedad limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
