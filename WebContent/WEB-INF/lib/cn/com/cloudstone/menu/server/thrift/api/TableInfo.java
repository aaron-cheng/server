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

/**
 * 餐桌信息
 */
public class TableInfo implements org.apache.thrift.TBase<TableInfo, TableInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CUSTOM_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("customNumber", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I32, (short)4);

  public String id; // required
  public int customNumber; // required
  /**
   * 
   * @see TableStatus
   */
  public TableStatus status; // required
  public int orderId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CUSTOM_NUMBER((short)2, "customNumber"),
    /**
     * 
     * @see TableStatus
     */
    STATUS((short)3, "status"),
    ORDER_ID((short)4, "orderId");

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
        case 1: // ID
          return ID;
        case 2: // CUSTOM_NUMBER
          return CUSTOM_NUMBER;
        case 3: // STATUS
          return STATUS;
        case 4: // ORDER_ID
          return ORDER_ID;
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
  private static final int __CUSTOMNUMBER_ISSET_ID = 0;
  private static final int __ORDERID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CUSTOM_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("customNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TableStatus.class)));
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableInfo.class, metaDataMap);
  }

  public TableInfo() {
  }

  public TableInfo(
    String id,
    int customNumber,
    TableStatus status,
    int orderId)
  {
    this();
    this.id = id;
    this.customNumber = customNumber;
    setCustomNumberIsSet(true);
    this.status = status;
    this.orderId = orderId;
    setOrderIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableInfo(TableInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.customNumber = other.customNumber;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.orderId = other.orderId;
  }

  public TableInfo deepCopy() {
    return new TableInfo(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setCustomNumberIsSet(false);
    this.customNumber = 0;
    this.status = null;
    setOrderIdIsSet(false);
    this.orderId = 0;
  }

  public String getId() {
    return this.id;
  }

  public TableInfo setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public int getCustomNumber() {
    return this.customNumber;
  }

  public TableInfo setCustomNumber(int customNumber) {
    this.customNumber = customNumber;
    setCustomNumberIsSet(true);
    return this;
  }

  public void unsetCustomNumber() {
    __isset_bit_vector.clear(__CUSTOMNUMBER_ISSET_ID);
  }

  /** Returns true if field customNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCustomNumber() {
    return __isset_bit_vector.get(__CUSTOMNUMBER_ISSET_ID);
  }

  public void setCustomNumberIsSet(boolean value) {
    __isset_bit_vector.set(__CUSTOMNUMBER_ISSET_ID, value);
  }

  /**
   * 
   * @see TableStatus
   */
  public TableStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TableStatus
   */
  public TableInfo setStatus(TableStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getOrderId() {
    return this.orderId;
  }

  public TableInfo setOrderId(int orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bit_vector.clear(__ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return __isset_bit_vector.get(__ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bit_vector.set(__ORDERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case CUSTOM_NUMBER:
      if (value == null) {
        unsetCustomNumber();
      } else {
        setCustomNumber((Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TableStatus)value);
      }
      break;

    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CUSTOM_NUMBER:
      return Integer.valueOf(getCustomNumber());

    case STATUS:
      return getStatus();

    case ORDER_ID:
      return Integer.valueOf(getOrderId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CUSTOM_NUMBER:
      return isSetCustomNumber();
    case STATUS:
      return isSetStatus();
    case ORDER_ID:
      return isSetOrderId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableInfo)
      return this.equals((TableInfo)that);
    return false;
  }

  public boolean equals(TableInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_customNumber = true;
    boolean that_present_customNumber = true;
    if (this_present_customNumber || that_present_customNumber) {
      if (!(this_present_customNumber && that_present_customNumber))
        return false;
      if (this.customNumber != that.customNumber)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TableInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TableInfo typedOther = (TableInfo)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustomNumber()).compareTo(typedOther.isSetCustomNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustomNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customNumber, typedOther.customNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, typedOther.orderId);
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
        case 1: // ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.id = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CUSTOM_NUMBER
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.customNumber = iprot.readI32();
            setCustomNumberIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // STATUS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.status = TableStatus.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ORDER_ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.orderId = iprot.readI32();
            setOrderIdIsSet(true);
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
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CUSTOM_NUMBER_FIELD_DESC);
    oprot.writeI32(this.customNumber);
    oprot.writeFieldEnd();
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
    oprot.writeI32(this.orderId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TableInfo(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("customNumber:");
    sb.append(this.customNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderId:");
    sb.append(this.orderId);
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
