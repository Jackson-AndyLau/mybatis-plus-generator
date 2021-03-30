package com.huazai.plus.common;

import com.baomidou.mybatisplus.core.toolkit.StringPool;

/**
 * 
 * @description
 *              <li>字符常量池
 * @class_name CString
 * @package com.huazai.plus.common
 * @created 2017年5月1日 下午6:00:06
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
public interface CString
{

	// ---------------------------------------------------------------- file suffix
	String C_DOT_CLASS = ".class";
	String C_DOT_JAVA = ".java";
	String C_DOT_DTO_JAVA = "DTO.java";
	String C_DOT_VO_JAVA = "VO.java";
	String C_DOT_XML = ".xml";
	String C_DOT_JSP = ".jsp";
	String C_DOT_HTML = ".html";

	// ---------------------------------------------------------------- boolean
	String C_FALSE = "false";
	String C_TRUE = "true";
	boolean C_TRUE_P = true;
	boolean C_FALSE_P = false;

	// ---------------------------------------------------------------- encoding
	String C_UTF_8 = "UTF-8";
	String C_GBK = "GBK";
	String C_GB2312 = "GB2312";
	String C_ASCII = "ASCII";
	String C_US_ASCII = "US-ASCII";
	String C_ISO_8859_1 = "ISO-8859-1";

	// ---------------------------------------------------------------- symbol
	String C_HTML_NBSP = "&nbsp;";
	String C_HTML_AMP = "&amp";
	String C_HTML_QUOTE = "&quot;";
	String C_HTML_LT = "&lt;";
	String C_HTML_GT = "&gt;";

	// ---------------------------------------------------------------- all
	String C_AMPERSAND = "&";
	String C_AND = "and";
	String C_AT = "@";
	String C_BACK_SLASH = "\\";
	String C_COLON = ":";
	String C_COMMA = ",";
	String C_DOLLAR = "$";
	String C_DOT = ".";
	String C_DOTDOT = "..";
	String C_EMPTY = "";
	String C_EQUALS = "=";
	String C_PLUS = "+";
	String C_DASH = "-";
	String C_ASTERISK = "*";
	String C_STAR = C_ASTERISK;
	String C_SLASH = "/";
	String C_HASH = "#";
	String C_HAT = "^";
	String C_LEFT_BRACE = "{";
	String C_LEFT_BRACKET = "(";
	String C_LEFT_CHEV = "<";
	String C_DOT_NEWLINE = ",\n";
	String C_NEWLINE = "\n";
	String C_PERCENT = "%";
	String C_PIPE = "|";
	String C_QUESTION_MARK = "?";
	String C_EXCLAMATION_MARK = "!";
	String C_QUOTE = "\"";
	String C_RETURN = "\r";
	String C_TAB = "\t";
	String C_RIGHT_BRACE = "}";
	String C_RIGHT_BRACKET = ")";
	String C_RIGHT_CHEV = ">";
	String C_SEMICOLON = ";";
	String C_SINGLE_QUOTE = "'";
	String C_BACKTICK = "`";
	String C_SPACE = " ";
	String C_TILDA = "~";
	String C_LEFT_SQ_BRACKET = "[";
	String C_RIGHT_SQ_BRACKET = "]";
	String C_UNDERSCORE = "_";
	String C_N = "n";
	String C_Y = "y";
	String C_NO = "no";
	String C_YES = "yes";
	String C_NULL = "null";
	String C_OFF = "off";
	String C_ON = "on";
	String C_ONE = "1";
	String C_ZERO = "0";
	String C_TWO = "2";
	String C_THREE = "3";
	String C_DOLLAR_LEFT_BRACE = "${";
	String C_HASH_LEFT_BRACE = "#{";
	String C_CRLF = "\r\n";

	// ---------------------------------------------------------------- array
	String[] EMPTY_ARRAY = new String[0];

	byte[] BYTES_NEW_LINE = StringPool.NEWLINE.getBytes();

}
