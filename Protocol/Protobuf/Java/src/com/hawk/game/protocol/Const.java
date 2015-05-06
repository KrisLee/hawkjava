// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Const.proto

package com.hawk.game.protocol;

public final class Const {
  private Const() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code chatType}
   *
   * <pre>
   * 聊天类型
   * </pre>
   */
  public enum chatType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHAT_WORLD = 1;</code>
     *
     * <pre>
     * 世界聊天
     * </pre>
     */
    CHAT_WORLD(0, 1),
    /**
     * <code>CHAT_BROADCAST = 2;</code>
     *
     * <pre>
     * 聊天广播
     * </pre>
     */
    CHAT_BROADCAST(1, 2),
    /**
     * <code>WORLD_BROADCAST = 3;</code>
     *
     * <pre>
     * 世界广播
     * </pre>
     */
    WORLD_BROADCAST(2, 3),
    ;

    /**
     * <code>CHAT_WORLD = 1;</code>
     *
     * <pre>
     * 世界聊天
     * </pre>
     */
    public static final int CHAT_WORLD_VALUE = 1;
    /**
     * <code>CHAT_BROADCAST = 2;</code>
     *
     * <pre>
     * 聊天广播
     * </pre>
     */
    public static final int CHAT_BROADCAST_VALUE = 2;
    /**
     * <code>WORLD_BROADCAST = 3;</code>
     *
     * <pre>
     * 世界广播
     * </pre>
     */
    public static final int WORLD_BROADCAST_VALUE = 3;


    public final int getNumber() { return value; }

    public static chatType valueOf(int value) {
      switch (value) {
        case 1: return CHAT_WORLD;
        case 2: return CHAT_BROADCAST;
        case 3: return WORLD_BROADCAST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<chatType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<chatType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<chatType>() {
            public chatType findValueByNumber(int number) {
              return chatType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.hawk.game.protocol.Const.getDescriptor().getEnumTypes().get(0);
    }

    private static final chatType[] VALUES = values();

    public static chatType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private chatType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:chatType)
  }

  /**
   * Protobuf enum {@code kickReason}
   *
   * <pre>
   * 被踢下线原因
   * </pre>
   */
  public enum kickReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DUPLICATE_LOGIN = 1;</code>
     */
    DUPLICATE_LOGIN(0, 1),
    /**
     * <code>SERVER_SHUTDOWN = 2;</code>
     */
    SERVER_SHUTDOWN(1, 2),
    /**
     * <code>LOGIN_FORBIDEN = 3;</code>
     */
    LOGIN_FORBIDEN(2, 3),
    /**
     * <code>KICKED_OUT = 4;</code>
     */
    KICKED_OUT(3, 4),
    /**
     * <code>SERVER_RESTART = 5;</code>
     */
    SERVER_RESTART(4, 5),
    ;

    /**
     * <code>DUPLICATE_LOGIN = 1;</code>
     */
    public static final int DUPLICATE_LOGIN_VALUE = 1;
    /**
     * <code>SERVER_SHUTDOWN = 2;</code>
     */
    public static final int SERVER_SHUTDOWN_VALUE = 2;
    /**
     * <code>LOGIN_FORBIDEN = 3;</code>
     */
    public static final int LOGIN_FORBIDEN_VALUE = 3;
    /**
     * <code>KICKED_OUT = 4;</code>
     */
    public static final int KICKED_OUT_VALUE = 4;
    /**
     * <code>SERVER_RESTART = 5;</code>
     */
    public static final int SERVER_RESTART_VALUE = 5;


    public final int getNumber() { return value; }

    public static kickReason valueOf(int value) {
      switch (value) {
        case 1: return DUPLICATE_LOGIN;
        case 2: return SERVER_SHUTDOWN;
        case 3: return LOGIN_FORBIDEN;
        case 4: return KICKED_OUT;
        case 5: return SERVER_RESTART;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<kickReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<kickReason>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<kickReason>() {
            public kickReason findValueByNumber(int number) {
              return kickReason.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.hawk.game.protocol.Const.getDescriptor().getEnumTypes().get(1);
    }

    private static final kickReason[] VALUES = values();

    public static kickReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private kickReason(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:kickReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Const.proto*C\n\010chatType\022\016\n\nCHAT_WORLD\020" +
      "\001\022\022\n\016CHAT_BROADCAST\020\002\022\023\n\017WORLD_BROADCAST" +
      "\020\003*n\n\nkickReason\022\023\n\017DUPLICATE_LOGIN\020\001\022\023\n" +
      "\017SERVER_SHUTDOWN\020\002\022\022\n\016LOGIN_FORBIDEN\020\003\022\016" +
      "\n\nKICKED_OUT\020\004\022\022\n\016SERVER_RESTART\020\005B\030\n\026co" +
      "m.hawk.game.protocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}