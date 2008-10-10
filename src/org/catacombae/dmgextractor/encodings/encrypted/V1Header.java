package org.catacombae.dmgextractor.encodings.encrypted;

import java.io.PrintStream;
import org.catacombae.dmgextractor.Util;

/** This class was generated by CStructToJavaClass. */
public class V1Header {
    /*
     * struct V1Header
     * size: 1276 bytes
     * description: 
     * 
     * BP    Size   Type          Identifier              Description                                         
     * -------------------------------------------------------------------------------------------------------
     * 0     1*48   uint8_t[48]   unknown0                Unknown data.                                       
     * 48    4      uint32_t      kdfIterationCount       Iteration count (normally 1000).                    
     * 52    4      uint32_t      kdfSaltLen              Length of kdfSalt (in bytes).                       
     * 56    1*48   uint8_t[48]   kdfSalt                 Salt value for key derivation.                      
     * 104   1*32   uint8_t[32]   unwrapIv                Initialization Vector for encryption-key unwrapping.
     * 136   4      uint32_t      lenWrappedAesKey        Length of wrappedAesKey (max 296).                  
     * 140   1*296  uint8_t[296]  wrappedAesKey           The AES key (wrapped).                              
     * 436   4      uint32_t      lenWrappedHmacSha1Key   Length of wrappedHmacSha1Key (max 300).             
     * 440   1*300  uint8_t[300]  wrappedHmacSha1Key      The HMAC SHA-1 key (wrapped).                       
     * 740   4      uint32_t      lenWrappedIntegrityKey  Length of wrappedIntegrityKey.                      
     * 744   1*48   uint8_t[48]   wrappedIntegrityKey     Integrity key.                                      
     * 792   1*476  uint8_t[476]  unknown792              Unknown data.                                       
     * 1268  1*8    uint8_t[8]    signature               Header signature (ASCII: 'cdsaencr').               
     */
    
    public static final int STRUCTSIZE = 1276;
    
    private final byte[] unknown0 = new byte[1*48];
    private final byte[] kdfIterationCount = new byte[4];
    private final byte[] kdfSaltLen = new byte[4];
    private final byte[] kdfSalt = new byte[1*48];
    private final byte[] unwrapIv = new byte[1*32];
    private final byte[] lenWrappedAesKey = new byte[4];
    private final byte[] wrappedAesKey = new byte[1*296];
    private final byte[] lenWrappedHmacSha1Key = new byte[4];
    private final byte[] wrappedHmacSha1Key = new byte[1*300];
    private final byte[] lenWrappedIntegrityKey = new byte[4];
    private final byte[] wrappedIntegrityKey = new byte[1*48];
    private final byte[] unknown792 = new byte[1*476];
    private final byte[] signature = new byte[1*8];
    
    public V1Header(byte[] data, int offset) {
	System.arraycopy(data, offset+0, unknown0, 0, 1*48);
	System.arraycopy(data, offset+48, kdfIterationCount, 0, 4);
	System.arraycopy(data, offset+52, kdfSaltLen, 0, 4);
	System.arraycopy(data, offset+56, kdfSalt, 0, 1*48);
	System.arraycopy(data, offset+104, unwrapIv, 0, 1*32);
	System.arraycopy(data, offset+136, lenWrappedAesKey, 0, 4);
	System.arraycopy(data, offset+140, wrappedAesKey, 0, 1*296);
	System.arraycopy(data, offset+436, lenWrappedHmacSha1Key, 0, 4);
	System.arraycopy(data, offset+440, wrappedHmacSha1Key, 0, 1*300);
	System.arraycopy(data, offset+740, lenWrappedIntegrityKey, 0, 4);
	System.arraycopy(data, offset+744, wrappedIntegrityKey, 0, 1*48);
	System.arraycopy(data, offset+792, unknown792, 0, 1*476);
	System.arraycopy(data, offset+1268, signature, 0, 1*8);
    }
    
    public static int length() { return STRUCTSIZE; }
    
    /** Unknown data. */
    public byte[] getUnknown0() { return Util.readByteArrayBE(unknown0); }
    /** Iteration count (normally 1000). */
    public int getKdfIterationCount() { return Util.readIntBE(kdfIterationCount); }
    /** Length of kdfSalt (in bytes). */
    public int getKdfSaltLen() { return Util.readIntBE(kdfSaltLen); }
    /** Salt value for key derivation. */
    public byte[] getKdfSalt() { return Util.readByteArrayBE(kdfSalt); }
    /** Initialization Vector for encryption-key unwrapping. */
    public byte[] getUnwrapIv() { return Util.readByteArrayBE(unwrapIv); }
    /** Length of wrappedAesKey (max 296). */
    public int getLenWrappedAesKey() { return Util.readIntBE(lenWrappedAesKey); }
    /** The AES key (wrapped). */
    public byte[] getWrappedAesKey() { return Util.readByteArrayBE(wrappedAesKey); }
    /** Length of wrappedHmacSha1Key (max 300). */
    public int getLenWrappedHmacSha1Key() { return Util.readIntBE(lenWrappedHmacSha1Key); }
    /** The HMAC SHA-1 key (wrapped). */
    public byte[] getWrappedHmacSha1Key() { return Util.readByteArrayBE(wrappedHmacSha1Key); }
    /** Length of wrappedIntegrityKey. */
    public int getLenWrappedIntegrityKey() { return Util.readIntBE(lenWrappedIntegrityKey); }
    /** Integrity key. */
    public byte[] getWrappedIntegrityKey() { return Util.readByteArrayBE(wrappedIntegrityKey); }
    /** Unknown data. */
    public byte[] getUnknown792() { return Util.readByteArrayBE(unknown792); }
    /** Header signature (ASCII: 'cdsaencr'). */
    public byte[] getSignature() { return Util.readByteArrayBE(signature); }
    
    public void printFields(PrintStream ps, String prefix) {
	ps.println(prefix + " unknown0: " + getUnknown0());
	ps.println(prefix + " kdfIterationCount: " + getKdfIterationCount());
	ps.println(prefix + " kdfSaltLen: " + getKdfSaltLen());
	ps.println(prefix + " kdfSalt: " + getKdfSalt());
	ps.println(prefix + " unwrapIv: " + getUnwrapIv());
	ps.println(prefix + " lenWrappedAesKey: " + getLenWrappedAesKey());
	ps.println(prefix + " wrappedAesKey: " + getWrappedAesKey());
	ps.println(prefix + " lenWrappedHmacSha1Key: " + getLenWrappedHmacSha1Key());
	ps.println(prefix + " wrappedHmacSha1Key: " + getWrappedHmacSha1Key());
	ps.println(prefix + " lenWrappedIntegrityKey: " + getLenWrappedIntegrityKey());
	ps.println(prefix + " wrappedIntegrityKey: " + getWrappedIntegrityKey());
	ps.println(prefix + " unknown792: " + getUnknown792());
	ps.println(prefix + " signature: " + getSignature());
    }
    
    public void print(PrintStream ps, String prefix) {
	ps.println(prefix + "V1Header:");
	printFields(ps, prefix);
    }
    
    public byte[] getBytes() {
	byte[] result = new byte[length()];
	int offset = 0;
	System.arraycopy(this.unknown0, 0, result, offset, this.unknown0.length); offset += this.unknown0.length;
	System.arraycopy(this.kdfIterationCount, 0, result, offset, this.kdfIterationCount.length); offset += this.kdfIterationCount.length;
	System.arraycopy(this.kdfSaltLen, 0, result, offset, this.kdfSaltLen.length); offset += this.kdfSaltLen.length;
	System.arraycopy(this.kdfSalt, 0, result, offset, this.kdfSalt.length); offset += this.kdfSalt.length;
	System.arraycopy(this.unwrapIv, 0, result, offset, this.unwrapIv.length); offset += this.unwrapIv.length;
	System.arraycopy(this.lenWrappedAesKey, 0, result, offset, this.lenWrappedAesKey.length); offset += this.lenWrappedAesKey.length;
	System.arraycopy(this.wrappedAesKey, 0, result, offset, this.wrappedAesKey.length); offset += this.wrappedAesKey.length;
	System.arraycopy(this.lenWrappedHmacSha1Key, 0, result, offset, this.lenWrappedHmacSha1Key.length); offset += this.lenWrappedHmacSha1Key.length;
	System.arraycopy(this.wrappedHmacSha1Key, 0, result, offset, this.wrappedHmacSha1Key.length); offset += this.wrappedHmacSha1Key.length;
	System.arraycopy(this.lenWrappedIntegrityKey, 0, result, offset, this.lenWrappedIntegrityKey.length); offset += this.lenWrappedIntegrityKey.length;
	System.arraycopy(this.wrappedIntegrityKey, 0, result, offset, this.wrappedIntegrityKey.length); offset += this.wrappedIntegrityKey.length;
	System.arraycopy(this.unknown792, 0, result, offset, this.unknown792.length); offset += this.unknown792.length;
	System.arraycopy(this.signature, 0, result, offset, this.signature.length); offset += this.signature.length;
	return result;
    }
}
