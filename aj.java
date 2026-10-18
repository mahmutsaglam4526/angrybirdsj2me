package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:aj.class */
public final class aj {
    private static char[] a = "0123456789abcdef".toCharArray();

    public static String a(float[] fArr) {
        if (fArr == null) {
            return "null";
        }
        int length = fArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int r6 = length - 1;
        if (length > 0) {
            int r5 = 0 + 1;
            stringBuffer.append(fArr[0]);
            while (true) {
                int r0 = r6;
                r6--;
                if (r0 <= 0) {
                    break;
                }
                stringBuffer.append(", ");
                int r2 = r5;
                r5++;
                stringBuffer.append(fArr[r2]);
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public static String a(int r6, int r7) {
        char[] cArr = new char[4];
        while (true) {
            int r0 = r7;
            r7--;
            if (r0 <= 0) {
                return new String(cArr);
            }
            cArr[r7] = a[r6 & 15];
            r6 >>= 4;
        }
    }

    public static int a(String str) {
        int r5 = 0;
        for (int r6 = 0; r6 < 8 && r6 < str.length(); r6++) {
            char lowerCase = Character.toLowerCase(str.charAt(r6));
            int r8 = -1;
            for (int r9 = 0; r9 < a.length; r9++) {
                if (lowerCase == a[r9]) {
                    r8 = r9;
                }
            }
            if (r8 == -1) {
                break;
            }
            r5 = ((r5 << 4) & (-16)) + (r8 & 15);
        }
        return r5;
    }

    public static double a(String str, double d) {
        byte b = 1;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int r16 = 0;
        double d4 = 1.0d;
        for (int r15 = 0; r15 < str.length(); r15++) {
            char cCharAt = str.charAt(r15);
            if (cCharAt == '-') {
                if (r15 != 0) {
                    return d;
                }
                b = -1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt == '.' && r16 == 0) {
                        r16++;
                    }
                    return d;
                }
                if (r16 == 0) {
                    d2 = (d2 * 10.0d) + ((double) (cCharAt - '0'));
                } else {
                    d4 *= 10.0d;
                    d3 = (d3 * 10.0d) + ((double) (cCharAt - '0'));
                }
            }
        }
        double d5 = d2 + (d3 / d4);
        return b < 0 ? -d5 : d5;
    }

    public static int b(String str) {
        byte b = 1;
        int r6 = 0;
        for (int r7 = 0; r7 < str.length(); r7++) {
            char cCharAt = str.charAt(r7);
            if (cCharAt == '-') {
                if (r7 != 0) {
                    return -1;
                }
                b = -1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return -1;
                }
                r6 = (r6 * 10) + (cCharAt - '0');
            }
        }
        return b < 0 ? -r6 : r6;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static long m10a(String str) {
        byte b = 1;
        long j = 0;
        for (int r7 = 0; r7 < str.length(); r7++) {
            char cCharAt = str.charAt(r7);
            if (cCharAt == '-') {
                if (r7 != 0) {
                    return 0L;
                }
                b = -1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt == 'L') {
                        break;
                    }
                    return 0L;
                }
                j = (j * 10) + ((long) (cCharAt - '0'));
            }
        }
        return b < 0 ? -j : j;
    }

    public static void a(StringBuffer stringBuffer, String str, String str2) {
        int r0;
        while (true) {
            int length = str.length();
            int length2 = (stringBuffer.length() - length) + 1;
            int r12 = 0;
            while (true) {
                if (r12 >= length2) {
                    r0 = -1;
                    break;
                }
                int r13 = 0;
                while (stringBuffer.charAt(r12 + r13) == str.charAt(r13)) {
                    r13++;
                    if (r13 == length) {
                        r0 = r12;
                        break;
                    }
                }
                r12++;
            }
            int r1 = r0;
            if (r0 < 0) {
                return;
            }
            stringBuffer.delete(r1, r1 + str.length());
            stringBuffer.insert(r1, str2);
        }
    }

    public static boolean a(char c) {
        if (c < 19968 || c > 40911) {
            return c >= 63744 && c <= 64255;
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m11a(String str) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        for (int r8 = 0; r8 < length; r8++) {
            cArr[r8] = Character.toLowerCase(str.charAt(r8));
        }
        return new String(cArr);
    }

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    }
}
