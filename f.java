package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:f.class */
public class f {
    private k a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Object f355a = new e();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Class f356a;
    private static Class b;
    private static Class c;
    private static Class d;
    private static Class e;
    private static Class f;
    private static Class g;
    private static Class h;

    public f() {
        a();
    }

    private void a() {
        this.a = new k();
    }

    public f(g gVar) {
        a(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Switch 'out' block B:5:0x000e for B:64:0x01c6 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:5:0x000e for B:6:0x0012 already processed. Defaulting to fallback option. */
    private void a(g gVar) {
        boolean z;
        Class<?> clsM176a;
        Class<?> clsM176a2;
        a();
        if (gVar.b() == '{') {
            while (true) {
                switch (gVar.b()) {
                    case 0:
                        return;
                    case '}':
                        return;
                    default:
                        gVar.a();
                        String string = gVar.m187a().toString();
                        char cB = gVar.b();
                        if (cB == '=') {
                            if (gVar.m185a() != '>') {
                                gVar.a();
                            }
                        } else if (cB != ':') {
                            return;
                        }
                        Object objM187a = gVar.m187a();
                        if (string != null && objM187a != null && c(string) == null && string != null) {
                            if (objM187a != null) {
                                if (objM187a != null) {
                                    Class<?> cls = objM187a.getClass();
                                    if (d == null) {
                                        clsM176a = m176a("java.lang.Double");
                                        d = clsM176a;
                                    } else {
                                        clsM176a = d;
                                    }
                                    if (cls == clsM176a) {
                                        double dDoubleValue = ((Double) objM187a).doubleValue();
                                        if (dDoubleValue == Double.NaN || dDoubleValue == Double.NEGATIVE_INFINITY || dDoubleValue == Double.POSITIVE_INFINITY) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    } else {
                                        Class<?> cls2 = objM187a.getClass();
                                        if (h == null) {
                                            clsM176a2 = m176a("java.lang.Float");
                                            h = clsM176a2;
                                        } else {
                                            clsM176a2 = h;
                                        }
                                        if (cls2 == clsM176a2) {
                                            float fFloatValue = ((Float) objM187a).floatValue();
                                            if (fFloatValue == Float.NaN || fFloatValue == Float.NEGATIVE_INFINITY || fFloatValue == Float.POSITIVE_INFINITY) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            z = true;
                                        }
                                    }
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    k kVar = this.a;
                                    int r0 = ab.a(string, kVar.a.f422a, kVar.a.a);
                                    if (r0 < 0) {
                                        kVar.a.a(r0 ^ (-1), string);
                                        kVar.b.a(r0 ^ (-1), objM187a);
                                    } else {
                                        kVar.a.f422a[r0] = string;
                                        kVar.b.f422a[r0] = objM187a;
                                    }
                                }
                            } else {
                                this.a.a(string);
                                k kVar2 = this.a;
                                int r1 = ab.a(string, kVar2.a.f422a, kVar2.a.a);
                                if (r1 >= 0) {
                                    kVar2.a.a(r1);
                                    kVar2.b.a(r1);
                                }
                            }
                        }
                        switch (gVar.b()) {
                            case ',':
                            case ';':
                                if (gVar.b() == '}') {
                                    return;
                                } else {
                                    gVar.a();
                                }
                                break;
                            case '}':
                                return;
                            default:
                                return;
                        }
                        break;
                }
            }
        }
    }

    public f(String str) {
        a(new g(str));
    }

    private Object b(String str) {
        Object objC;
        if (str == null || (objC = c(str)) == null) {
            return null;
        }
        return objC;
    }

    public final double a(String str) {
        Class<?> clsM176a;
        Class<?> clsM176a2;
        Class<?> clsM176a3;
        Class<?> clsM176a4;
        Object objB = b(str);
        if (objB == null) {
            return Double.NaN;
        }
        Class<?> cls = objB.getClass();
        if (d == null) {
            clsM176a = m176a("java.lang.Double");
            d = clsM176a;
        } else {
            clsM176a = d;
        }
        if (cls == clsM176a) {
            return ((Double) objB).doubleValue();
        }
        Class<?> cls2 = objB.getClass();
        if (e == null) {
            clsM176a2 = m176a("java.lang.Integer");
            e = clsM176a2;
        } else {
            clsM176a2 = e;
        }
        if (cls2 == clsM176a2) {
            return ((Integer) objB).intValue();
        }
        Class<?> cls3 = objB.getClass();
        if (f == null) {
            clsM176a3 = m176a("java.lang.Long");
            f = clsM176a3;
        } else {
            clsM176a3 = f;
        }
        if (cls3 == clsM176a3) {
            return ((Long) objB).longValue();
        }
        Class<?> cls4 = objB.getClass();
        if (c == null) {
            clsM176a4 = m176a("java.lang.String");
            c = clsM176a4;
        } else {
            clsM176a4 = c;
        }
        if (cls4 == clsM176a4) {
            return aj.a((String) objB, Double.NaN);
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m170a(String str) {
        Class<?> clsM176a;
        Class<?> clsM176a2;
        Object objB = b(str);
        if (objB == null) {
            return -1;
        }
        Class<?> cls = objB.getClass();
        if (e == null) {
            clsM176a = m176a("java.lang.Integer");
            e = clsM176a;
        } else {
            clsM176a = e;
        }
        if (cls == clsM176a) {
            return ((Integer) objB).intValue();
        }
        Class<?> cls2 = objB.getClass();
        if (c == null) {
            clsM176a2 = m176a("java.lang.String");
            c = clsM176a2;
        } else {
            clsM176a2 = c;
        }
        if (cls2 == clsM176a2) {
            return aj.b((String) objB);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final d m171a(String str) {
        Class<?> clsM176a;
        Object objB = b(str);
        if (objB == null) {
            return null;
        }
        Class<?> cls = objB.getClass();
        if (f356a == null) {
            clsM176a = m176a("d");
            f356a = clsM176a;
        } else {
            clsM176a = f356a;
        }
        if (cls == clsM176a) {
            return (d) objB;
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final f m172a(String str) {
        Class<?> clsM176a;
        Object objB = b(str);
        if (objB == null) {
            return null;
        }
        Class<?> cls = objB.getClass();
        if (g == null) {
            clsM176a = m176a("f");
            g = clsM176a;
        } else {
            clsM176a = g;
        }
        if (cls == clsM176a) {
            return (f) objB;
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m173a(String str) {
        Class<?> clsM176a;
        Object objB = b(str);
        if (objB == null) {
            return null;
        }
        Class<?> cls = objB.getClass();
        if (c == null) {
            clsM176a = m176a("java.lang.String");
            c = clsM176a;
        } else {
            clsM176a = c;
        }
        if (cls == clsM176a) {
            return (String) objB;
        }
        return null;
    }

    private Object c(String str) {
        if (str == null) {
            return null;
        }
        return this.a.a(str);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static String m174b(String str) {
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        char c2 = 0;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\"');
        for (int r7 = 0; r7 < length; r7++) {
            char c3 = c2;
            char cCharAt = str.charAt(r7);
            c2 = cCharAt;
            switch (cCharAt) {
                case '\b':
                    stringBuffer.append("\\b");
                    break;
                case '\t':
                    stringBuffer.append("\\t");
                    break;
                case '\n':
                    stringBuffer.append("\\n");
                    break;
                case '\f':
                    stringBuffer.append("\\f");
                    break;
                case '\r':
                    stringBuffer.append("\\r");
                    break;
                case '\"':
                case '\\':
                    stringBuffer.append('\\');
                    stringBuffer.append(c2);
                    break;
                case '/':
                    if (c3 == '<') {
                        stringBuffer.append('\\');
                    }
                    stringBuffer.append(c2);
                    break;
                default:
                    if (c2 < ' ' || ((c2 >= 128 && c2 < 160) || (c2 >= 8192 && c2 < 8448))) {
                        stringBuffer.append("\\u");
                        stringBuffer.append(aj.a(c2, 4));
                    } else {
                        stringBuffer.append(c2);
                    }
                    break;
            }
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Object m175a(String str) {
        if (str.compareTo("") == 0) {
            return str;
        }
        String strM11a = aj.m11a(str);
        if (strM11a.compareTo("true") == 0) {
            return new Boolean(true);
        }
        if (strM11a.compareTo("false") == 0) {
            return new Boolean(false);
        }
        if (strM11a.compareTo("null") == 0) {
            return f355a;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '-' || cCharAt == '+') {
            if (cCharAt == '0' && str.length() > 2 && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
                return new Integer(aj.a(str.substring(2)));
            }
            if (str.indexOf(46) < 0 && str.indexOf(101) < 0 && str.indexOf(69) < 0) {
                long jM10a = aj.m10a(str);
                int r0 = (int) jM10a;
                return jM10a == ((long) r0) ? new Integer(r0) : new Long(jM10a);
            }
            double dA = aj.a(str, Double.NaN);
            if (dA != Double.NaN) {
                return new Double(dA);
            }
        }
        return str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        for (int r6 = 0; r6 < this.a.a.a; r6++) {
            if (stringBuffer.length() > 1) {
                stringBuffer.append(',');
            }
            stringBuffer.append(m174b(this.a.m192a(r6)));
            stringBuffer.append(':');
            stringBuffer.append(a(this.a.a(r6)));
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static String a(Object obj) {
        Class<?> clsM176a;
        Class<?> clsM176a2;
        Class<?> clsM176a3;
        Class<?> clsM176a4;
        Class<?> clsM176a5;
        Class<?> clsM176a6;
        Class<?> clsM176a7;
        Class<?> clsM176a8;
        if (obj == null || obj == f355a) {
            return "null";
        }
        Class<?> cls = obj.getClass();
        if (h == null) {
            clsM176a = m176a("java.lang.Float");
            h = clsM176a;
        } else {
            clsM176a = h;
        }
        if (cls == clsM176a) {
            return Float.toString(((Float) obj).floatValue());
        }
        Class<?> cls2 = obj.getClass();
        if (d == null) {
            clsM176a2 = m176a("java.lang.Double");
            d = clsM176a2;
        } else {
            clsM176a2 = d;
        }
        if (cls2 == clsM176a2) {
            return Double.toString(((Double) obj).doubleValue());
        }
        Class<?> cls3 = obj.getClass();
        if (e == null) {
            clsM176a3 = m176a("java.lang.Integer");
            e = clsM176a3;
        } else {
            clsM176a3 = e;
        }
        if (cls3 == clsM176a3) {
            return Integer.toString(((Integer) obj).intValue());
        }
        Class<?> cls4 = obj.getClass();
        if (f == null) {
            clsM176a4 = m176a("java.lang.Long");
            f = clsM176a4;
        } else {
            clsM176a4 = f;
        }
        if (cls4 == clsM176a4) {
            return Long.toString(((Long) obj).longValue());
        }
        Class<?> cls5 = obj.getClass();
        if (b == null) {
            clsM176a5 = m176a("java.lang.Boolean");
            b = clsM176a5;
        } else {
            clsM176a5 = b;
        }
        if (cls5 == clsM176a5) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        Class<?> cls6 = obj.getClass();
        if (g == null) {
            clsM176a6 = m176a("f");
            g = clsM176a6;
        } else {
            clsM176a6 = g;
        }
        if (cls6 == clsM176a6) {
            return ((f) obj).toString();
        }
        Class<?> cls7 = obj.getClass();
        if (f356a == null) {
            clsM176a7 = m176a("d");
            f356a = clsM176a7;
        } else {
            clsM176a7 = f356a;
        }
        if (cls7 == clsM176a7) {
            return ((d) obj).toString();
        }
        Class<?> cls8 = obj.getClass();
        if (c == null) {
            clsM176a8 = m176a("java.lang.String");
            c = clsM176a8;
        } else {
            clsM176a8 = c;
        }
        return cls8 == clsM176a8 ? m174b((String) obj) : m174b(obj.toString());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Class m176a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }
}
