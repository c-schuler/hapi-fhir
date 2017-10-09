//
// Translated by CS2J (http://www.cs2j.com): 8/18/2017 3:07:35 PM
//

package org.hl7.fhir.r4.utils.transform.deserializer;

/**
 * Enum for group types.
 */
public enum FhirMapGroupTypes
{
    /**
     Unset value
     */
    NotSet,

    /**
     Group type types
     */
    Types,

    /**
     Group type type types
     */
    TypeTypes;

    public static final int SIZE = java.lang.Integer.SIZE;

  /**
   * Returns a lowercase string of the relevant values of FhirMapGroupTypes
   * @return
   */
  public String getValue()
    {
        switch (this){
          case Types:
            return "types";
          case TypeTypes:
            return "type+types";
          default:
            return "?";
        }
    }

    public static FhirMapGroupTypes forValue(int value)
    {
        return values()[value];
    }
}