// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/Cars.proto

// Protobuf Java Version: 3.25.2
package cars.generated;

/**
 * Protobuf type {@code Car}
 */
public final class Car extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Car)
    CarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Car.newBuilder() to construct.
  private Car(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Car() {
    brand_ = "";
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Car();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cars.generated.Cars.internal_static_Car_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cars.generated.Cars.internal_static_Car_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cars.generated.Car.class, cars.generated.Car.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_ = 0;
  /**
   * <code>required int32 id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int BRAND_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object brand_ = "";
  /**
   * <code>required string brand = 2;</code>
   * @return Whether the brand field is set.
   */
  @java.lang.Override
  public boolean hasBrand() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required string brand = 2;</code>
   * @return The brand.
   */
  @java.lang.Override
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        brand_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string brand = 2;</code>
   * @return The bytes for brand.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";
  /**
   * <code>required string model = 3;</code>
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required string model = 3;</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        model_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string model = 3;</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YEAR_FIELD_NUMBER = 4;
  private int year_ = 0;
  /**
   * <code>required int32 year = 4;</code>
   * @return Whether the year field is set.
   */
  @java.lang.Override
  public boolean hasYear() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required int32 year = 4;</code>
   * @return The year.
   */
  @java.lang.Override
  public int getYear() {
    return year_;
  }

  public static final int AVAILABLETOBUY_FIELD_NUMBER = 5;
  private boolean availableToBuy_ = false;
  /**
   * <code>required bool availableToBuy = 5;</code>
   * @return Whether the availableToBuy field is set.
   */
  @java.lang.Override
  public boolean hasAvailableToBuy() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>required bool availableToBuy = 5;</code>
   * @return The availableToBuy.
   */
  @java.lang.Override
  public boolean getAvailableToBuy() {
    return availableToBuy_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasBrand()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasModel()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasYear()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasAvailableToBuy()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, brand_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, model_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, year_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBool(5, availableToBuy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, brand_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, model_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, year_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, availableToBuy_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cars.generated.Car)) {
      return super.equals(obj);
    }
    cars.generated.Car other = (cars.generated.Car) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasBrand() != other.hasBrand()) return false;
    if (hasBrand()) {
      if (!getBrand()
          .equals(other.getBrand())) return false;
    }
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel()
          .equals(other.getModel())) return false;
    }
    if (hasYear() != other.hasYear()) return false;
    if (hasYear()) {
      if (getYear()
          != other.getYear()) return false;
    }
    if (hasAvailableToBuy() != other.hasAvailableToBuy()) return false;
    if (hasAvailableToBuy()) {
      if (getAvailableToBuy()
          != other.getAvailableToBuy()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
    }
    if (hasBrand()) {
      hash = (37 * hash) + BRAND_FIELD_NUMBER;
      hash = (53 * hash) + getBrand().hashCode();
    }
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    if (hasYear()) {
      hash = (37 * hash) + YEAR_FIELD_NUMBER;
      hash = (53 * hash) + getYear();
    }
    if (hasAvailableToBuy()) {
      hash = (37 * hash) + AVAILABLETOBUY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAvailableToBuy());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cars.generated.Car parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cars.generated.Car parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cars.generated.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cars.generated.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cars.generated.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cars.generated.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cars.generated.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cars.generated.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cars.generated.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cars.generated.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cars.generated.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cars.generated.Car parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cars.generated.Car prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Car)
      cars.generated.CarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cars.generated.Cars.internal_static_Car_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cars.generated.Cars.internal_static_Car_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cars.generated.Car.class, cars.generated.Car.Builder.class);
    }

    // Construct using cars.generated.Car.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0;
      brand_ = "";
      model_ = "";
      year_ = 0;
      availableToBuy_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cars.generated.Cars.internal_static_Car_descriptor;
    }

    @java.lang.Override
    public cars.generated.Car getDefaultInstanceForType() {
      return cars.generated.Car.getDefaultInstance();
    }

    @java.lang.Override
    public cars.generated.Car build() {
      cars.generated.Car result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cars.generated.Car buildPartial() {
      cars.generated.Car result = new cars.generated.Car(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cars.generated.Car result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.brand_ = brand_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.model_ = model_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.year_ = year_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.availableToBuy_ = availableToBuy_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cars.generated.Car) {
        return mergeFrom((cars.generated.Car)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cars.generated.Car other) {
      if (other == cars.generated.Car.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasBrand()) {
        brand_ = other.brand_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasModel()) {
        model_ = other.model_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasYear()) {
        setYear(other.getYear());
      }
      if (other.hasAvailableToBuy()) {
        setAvailableToBuy(other.getAvailableToBuy());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasId()) {
        return false;
      }
      if (!hasBrand()) {
        return false;
      }
      if (!hasModel()) {
        return false;
      }
      if (!hasYear()) {
        return false;
      }
      if (!hasAvailableToBuy()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              brand_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              model_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              year_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              availableToBuy_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>required int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>required int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>required string brand = 2;</code>
     * @return Whether the brand field is set.
     */
    public boolean hasBrand() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string brand = 2;</code>
     * @return The brand.
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          brand_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string brand = 2;</code>
     * @return The bytes for brand.
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string brand = 2;</code>
     * @param value The brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      brand_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required string brand = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrand() {
      brand_ = getDefaultInstance().getBrand();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>required string brand = 2;</code>
     * @param value The bytes for brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      brand_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>required string model = 3;</code>
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string model = 3;</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          model_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string model = 3;</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string model = 3;</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      model_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>required string model = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>required string model = 3;</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      model_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int year_ ;
    /**
     * <code>required int32 year = 4;</code>
     * @return Whether the year field is set.
     */
    @java.lang.Override
    public boolean hasYear() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required int32 year = 4;</code>
     * @return The year.
     */
    @java.lang.Override
    public int getYear() {
      return year_;
    }
    /**
     * <code>required int32 year = 4;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(int value) {

      year_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 year = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      bitField0_ = (bitField0_ & ~0x00000008);
      year_ = 0;
      onChanged();
      return this;
    }

    private boolean availableToBuy_ ;
    /**
     * <code>required bool availableToBuy = 5;</code>
     * @return Whether the availableToBuy field is set.
     */
    @java.lang.Override
    public boolean hasAvailableToBuy() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required bool availableToBuy = 5;</code>
     * @return The availableToBuy.
     */
    @java.lang.Override
    public boolean getAvailableToBuy() {
      return availableToBuy_;
    }
    /**
     * <code>required bool availableToBuy = 5;</code>
     * @param value The availableToBuy to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableToBuy(boolean value) {

      availableToBuy_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>required bool availableToBuy = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableToBuy() {
      bitField0_ = (bitField0_ & ~0x00000010);
      availableToBuy_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Car)
  }

  // @@protoc_insertion_point(class_scope:Car)
  private static final cars.generated.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cars.generated.Car();
  }

  public static cars.generated.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Car>
      PARSER = new com.google.protobuf.AbstractParser<Car>() {
    @java.lang.Override
    public Car parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Car> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Car> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cars.generated.Car getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

