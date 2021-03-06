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

public class PadInfo implements org.apache.thrift.TBase<PadInfo, PadInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PadInfo");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IMEI_FIELD_DESC = new org.apache.thrift.protocol.TField("IMEI", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BATTERY_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("batteryLevel", org.apache.thrift.protocol.TType.I32, (short)3);

  public String sessionId; // required
  public String IMEI; // required
  public int batteryLevel; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    IMEI((short)2, "IMEI"),
    BATTERY_LEVEL((short)3, "batteryLevel");

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
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // IMEI
          return IMEI;
        case 3: // BATTERY_LEVEL
          return BATTERY_LEVEL;
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
  private static final int __BATTERYLEVEL_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMEI, new org.apache.thrift.meta_data.FieldMetaData("IMEI", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BATTERY_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("batteryLevel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PadInfo.class, metaDataMap);
  }

  public PadInfo() {
  }

  public PadInfo(
    String sessionId,
    String IMEI,
    int batteryLevel)
  {
    this();
    this.sessionId = sessionId;
    this.IMEI = IMEI;
    this.batteryLevel = batteryLevel;
    setBatteryLevelIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PadInfo(PadInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
    if (other.isSetIMEI()) {
      this.IMEI = other.IMEI;
    }
    this.batteryLevel = other.batteryLevel;
  }

  public PadInfo deepCopy() {
    return new PadInfo(this);
  }

  @Override
  public void clear() {
    this.sessionId = null;
    this.IMEI = null;
    setBatteryLevelIsSet(false);
    this.batteryLevel = 0;
  }

  public String getSessionId() {
    return this.sessionId;
  }

  public PadInfo setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public void unsetSessionId() {
    this.sessionId = null;
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return this.sessionId != null;
  }

  public void setSessionIdIsSet(boolean value) {
    if (!value) {
      this.sessionId = null;
    }
  }

  public String getIMEI() {
    return this.IMEI;
  }

  public PadInfo setIMEI(String IMEI) {
    this.IMEI = IMEI;
    return this;
  }

  public void unsetIMEI() {
    this.IMEI = null;
  }

  /** Returns true if field IMEI is set (has been assigned a value) and false otherwise */
  public boolean isSetIMEI() {
    return this.IMEI != null;
  }

  public void setIMEIIsSet(boolean value) {
    if (!value) {
      this.IMEI = null;
    }
  }

  public int getBatteryLevel() {
    return this.batteryLevel;
  }

  public PadInfo setBatteryLevel(int batteryLevel) {
    this.batteryLevel = batteryLevel;
    setBatteryLevelIsSet(true);
    return this;
  }

  public void unsetBatteryLevel() {
    __isset_bit_vector.clear(__BATTERYLEVEL_ISSET_ID);
  }

  /** Returns true if field batteryLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetBatteryLevel() {
    return __isset_bit_vector.get(__BATTERYLEVEL_ISSET_ID);
  }

  public void setBatteryLevelIsSet(boolean value) {
    __isset_bit_vector.set(__BATTERYLEVEL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((String)value);
      }
      break;

    case IMEI:
      if (value == null) {
        unsetIMEI();
      } else {
        setIMEI((String)value);
      }
      break;

    case BATTERY_LEVEL:
      if (value == null) {
        unsetBatteryLevel();
      } else {
        setBatteryLevel((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case IMEI:
      return getIMEI();

    case BATTERY_LEVEL:
      return Integer.valueOf(getBatteryLevel());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case IMEI:
      return isSetIMEI();
    case BATTERY_LEVEL:
      return isSetBatteryLevel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PadInfo)
      return this.equals((PadInfo)that);
    return false;
  }

  public boolean equals(PadInfo that) {
    if (that == null)
      return false;

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    boolean this_present_IMEI = true && this.isSetIMEI();
    boolean that_present_IMEI = true && that.isSetIMEI();
    if (this_present_IMEI || that_present_IMEI) {
      if (!(this_present_IMEI && that_present_IMEI))
        return false;
      if (!this.IMEI.equals(that.IMEI))
        return false;
    }

    boolean this_present_batteryLevel = true;
    boolean that_present_batteryLevel = true;
    if (this_present_batteryLevel || that_present_batteryLevel) {
      if (!(this_present_batteryLevel && that_present_batteryLevel))
        return false;
      if (this.batteryLevel != that.batteryLevel)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PadInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PadInfo typedOther = (PadInfo)other;

    lastComparison = Boolean.valueOf(isSetSessionId()).compareTo(typedOther.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, typedOther.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIMEI()).compareTo(typedOther.isSetIMEI());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIMEI()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IMEI, typedOther.IMEI);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBatteryLevel()).compareTo(typedOther.isSetBatteryLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatteryLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batteryLevel, typedOther.batteryLevel);
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
        case 1: // SESSION_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.sessionId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IMEI
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.IMEI = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // BATTERY_LEVEL
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.batteryLevel = iprot.readI32();
            setBatteryLevelIsSet(true);
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
    if (this.sessionId != null) {
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeString(this.sessionId);
      oprot.writeFieldEnd();
    }
    if (this.IMEI != null) {
      oprot.writeFieldBegin(IMEI_FIELD_DESC);
      oprot.writeString(this.IMEI);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(BATTERY_LEVEL_FIELD_DESC);
    oprot.writeI32(this.batteryLevel);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PadInfo(");
    boolean first = true;

    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("IMEI:");
    if (this.IMEI == null) {
      sb.append("null");
    } else {
      sb.append(this.IMEI);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("batteryLevel:");
    sb.append(this.batteryLevel);
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

