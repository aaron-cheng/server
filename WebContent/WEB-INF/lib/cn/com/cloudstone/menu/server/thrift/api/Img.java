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
 * 图片对象
 */
public class Img implements org.apache.thrift.TBase<Img, Img._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Img");

  private static final org.apache.thrift.protocol.TField PREVIEW_IMG_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("previewImgUrl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IMG_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("imgUrl", org.apache.thrift.protocol.TType.STRING, (short)2);

  public String previewImgUrl; // required
  public String imgUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PREVIEW_IMG_URL((short)1, "previewImgUrl"),
    IMG_URL((short)2, "imgUrl");

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
        case 1: // PREVIEW_IMG_URL
          return PREVIEW_IMG_URL;
        case 2: // IMG_URL
          return IMG_URL;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PREVIEW_IMG_URL, new org.apache.thrift.meta_data.FieldMetaData("previewImgUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMG_URL, new org.apache.thrift.meta_data.FieldMetaData("imgUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Img.class, metaDataMap);
  }

  public Img() {
  }

  public Img(
    String previewImgUrl,
    String imgUrl)
  {
    this();
    this.previewImgUrl = previewImgUrl;
    this.imgUrl = imgUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Img(Img other) {
    if (other.isSetPreviewImgUrl()) {
      this.previewImgUrl = other.previewImgUrl;
    }
    if (other.isSetImgUrl()) {
      this.imgUrl = other.imgUrl;
    }
  }

  public Img deepCopy() {
    return new Img(this);
  }

  @Override
  public void clear() {
    this.previewImgUrl = null;
    this.imgUrl = null;
  }

  public String getPreviewImgUrl() {
    return this.previewImgUrl;
  }

  public Img setPreviewImgUrl(String previewImgUrl) {
    this.previewImgUrl = previewImgUrl;
    return this;
  }

  public void unsetPreviewImgUrl() {
    this.previewImgUrl = null;
  }

  /** Returns true if field previewImgUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetPreviewImgUrl() {
    return this.previewImgUrl != null;
  }

  public void setPreviewImgUrlIsSet(boolean value) {
    if (!value) {
      this.previewImgUrl = null;
    }
  }

  public String getImgUrl() {
    return this.imgUrl;
  }

  public Img setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  public void unsetImgUrl() {
    this.imgUrl = null;
  }

  /** Returns true if field imgUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetImgUrl() {
    return this.imgUrl != null;
  }

  public void setImgUrlIsSet(boolean value) {
    if (!value) {
      this.imgUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PREVIEW_IMG_URL:
      if (value == null) {
        unsetPreviewImgUrl();
      } else {
        setPreviewImgUrl((String)value);
      }
      break;

    case IMG_URL:
      if (value == null) {
        unsetImgUrl();
      } else {
        setImgUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PREVIEW_IMG_URL:
      return getPreviewImgUrl();

    case IMG_URL:
      return getImgUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PREVIEW_IMG_URL:
      return isSetPreviewImgUrl();
    case IMG_URL:
      return isSetImgUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Img)
      return this.equals((Img)that);
    return false;
  }

  public boolean equals(Img that) {
    if (that == null)
      return false;

    boolean this_present_previewImgUrl = true && this.isSetPreviewImgUrl();
    boolean that_present_previewImgUrl = true && that.isSetPreviewImgUrl();
    if (this_present_previewImgUrl || that_present_previewImgUrl) {
      if (!(this_present_previewImgUrl && that_present_previewImgUrl))
        return false;
      if (!this.previewImgUrl.equals(that.previewImgUrl))
        return false;
    }

    boolean this_present_imgUrl = true && this.isSetImgUrl();
    boolean that_present_imgUrl = true && that.isSetImgUrl();
    if (this_present_imgUrl || that_present_imgUrl) {
      if (!(this_present_imgUrl && that_present_imgUrl))
        return false;
      if (!this.imgUrl.equals(that.imgUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Img other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Img typedOther = (Img)other;

    lastComparison = Boolean.valueOf(isSetPreviewImgUrl()).compareTo(typedOther.isSetPreviewImgUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreviewImgUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.previewImgUrl, typedOther.previewImgUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImgUrl()).compareTo(typedOther.isSetImgUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImgUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imgUrl, typedOther.imgUrl);
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
        case 1: // PREVIEW_IMG_URL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.previewImgUrl = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IMG_URL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.imgUrl = iprot.readString();
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
    if (this.previewImgUrl != null) {
      oprot.writeFieldBegin(PREVIEW_IMG_URL_FIELD_DESC);
      oprot.writeString(this.previewImgUrl);
      oprot.writeFieldEnd();
    }
    if (this.imgUrl != null) {
      oprot.writeFieldBegin(IMG_URL_FIELD_DESC);
      oprot.writeString(this.imgUrl);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Img(");
    boolean first = true;

    sb.append("previewImgUrl:");
    if (this.previewImgUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.previewImgUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("imgUrl:");
    if (this.imgUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.imgUrl);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
