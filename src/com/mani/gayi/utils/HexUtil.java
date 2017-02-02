package com.mani.gayi.utils;

/**
 * 
 */

import org.apache.commons.codec.binary.Base64;

/**
 * Hex encoder and decoder.
 */
public class HexUtil {

	private static final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	/**
	 * Converts an array of bytes into an array of characters representing the
	 * hexidecimal values of each byte in order. The returned array will be
	 * double the length of the passed array, as it takes two characters to
	 * represent any given byte.
	 * 
	 * @param bytes
	 *            a byte[] to convert to Hex characters
	 * @return A string containing hexidecimal characters
	 */
	public static String bytesToHex(byte[] bytes) {
		StringBuffer buff = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			buff.append(HEX_CHARS[(bytes[i] >> 4) & 0x0f]);
			buff.append(HEX_CHARS[bytes[i] & 0x0f]);
		}
		return buff.toString();
	}

	/**
	 * Converts the string representing hexidecimal values into an array of
	 * bytes of those same values. The returned array will be half the length of
	 * the passed array, as it takes two characters to represent any given byte.
	 * An exception is thrown if the passed char array has an odd number of
	 * elements.
	 * 
	 * @param hex
	 *            the string containing hexidecimal digits
	 * @return A byte array containing binary data decoded from the supplied
	 *         string.
	 */
	public static byte[] hexToBytes(String hex) {
		if (hex.length() % 2 != 0) {
			throw new IllegalArgumentException(
					"Uneven number of hex characters");
		}

		byte[] result = new byte[hex.length() / 2];
		for (int i = 0, j = 0; i < hex.length(); i += 2) {
			char c1 = hex.charAt(i);
			char c2 = hex.charAt(i + 1);
			result[j++] = (byte) ((getHexValue(c1) * 16) + getHexValue(c2));
		}
		return result;
	}

	private static int getHexValue(char c) {
		if ((c >= '0') && (c <= '9')) {
			return (c - '0');
		} else if ((c >= 'a') && (c <= 'f')) {
			return (c - 'a' + 10);
		} else if ((c >= 'A') && (c <= 'F')) {
			return (c - 'A' + 10);
		} else {
			throw new IllegalArgumentException("Invalid hex character: " + c);
		}
	}

	/**
	 * Converts the string representing hexidecimal values into string
	 * representing base64 algorithm (RFC 2045) based values.
	 * 
	 * @param hex
	 *            the string containing hexidecimal digits
	 * @return the string containing base64 algorithm (RFC 2045) based values.
	 */
	public static String hexToBase64(String hexData) {
		byte[] result = Base64.encodeBase64(hexToBytes(hexData));
		return new String(result);
	}

	/**
	 * Converts the string representing base64 algorithm (RFC 2045) based values
	 * into string representing hexidecimal values.
	 * 
	 * @param base64Data
	 *            the string containing base64 algorithm (RFC 2045) based values
	 * @return the string containing hexidecimal values.
	 */
	public static String base64ToHex(String base64Data) {
		byte[] result = Base64.decodeBase64(base64Data.getBytes());
		return bytesToHex(result);
	}
}
