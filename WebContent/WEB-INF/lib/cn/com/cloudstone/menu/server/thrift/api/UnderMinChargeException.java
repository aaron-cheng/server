/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cn.com.cloudstone.menu.server.thrift.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnderMinChargeException extends Exception implements org.apache.thrift.TBase<UnderMinChargeException, UnderMinChargeException._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UnderMinChargeException");

  private static final org.apache.thrift.protocol.TField MIN_CHARGE_FIELD_DESC = new org.apache.thrift.protocol.TField("minCharge", org.apache.thrift.protocol.TType.I32, (short)1);

  public int minCharge; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MIN_CHARGE((short)1, "minCharge");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MIN_CHARGE
          return MIN_CHARGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MINCHARGE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MIN_CHARGE, new org.apache.thrift.meta_data.FieldMetaData("minCharge", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UnderMinChargeException.class, metaDataMap);
  }

  public UnderMinChargeException() {
  }

  public UnderMinChargeException(
    int minCharge)
  {
    this();
    this.minCharge = minCharge;
    setMinChargeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UnderMinChargeException(UnderMinChargeException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.minCharge = other.minCharge;
  }

  public UnderMinChargeException deepCopy() {
    return new UnderMinChargeException(this);
  }

  @Override
  public void clear() {
    setMinChargeIsSet(false);
    this.minCharge = 0;
  }

  public int getMinCharge() {
    return this.minCharge;
  }

  public UnderMinChargeException setMinCharge(int minCharge) {
    this.minCharge = minCharge;
    setMinChargeIsSet(true);
    return this;
  }

  public void unsetMinCharge() {
    __isset_bit_vector.clear(__MINCHARGE_ISSET_ID);
  }

  /** Returns true if field minCharge is set (has been assigned a value) and false otherwise */
  public boolean isSetMinCharge() {
    return __isset_bit_vector.get(__MINCHARGE_ISSET_ID);
  }

  public void setMinChargeIsSet(boolean value) {
    __isset_bit_vector.set(__MINCHARGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MIN_CHARGE:
      if (value == null) {
        unsetMinCharge();
      } else {
        setMinCharge((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MIN_CHARGE:
      return Integer.valueOf(getMinCharge());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MIN_CHARGE:
      return isSetMinCharge();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UnderMinChargeException)
      return this.equals((UnderMinChargeException)that);
    return false;
  }

  public boolean equals(UnderMinChargeException that) {
    if (that == null)
      return false;

    boolean this_present_minCharge = true;
    boolean that_present_minCharge = true;
    if (this_present_minCharge || that_present_minCharge) {
      if (!(this_present_minCharge && that_present_minCharge))
        return false;
      if (this.minCharge != that.minCharge)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UnderMinChargeException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UnderMinChargeException typedOther = (UnderMinChargeException)other;

    lastComparison = Boolean.valueOf(isSetMinCharge()).compareTo(typedOther.isSetMinCharge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinCharge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minCharge, typedOther.minCharge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // MIN_CHARGE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.minCharge = iprot.readI32();
            setMinChargeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(MIN_CHARGE_FIELD_DESC);
    oprot.writeI32(this.minCharge);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UnderMinChargeException(");
    boolean first = true;

    sb.append("minCharge:");
    sb.append(this.minCharge);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

