package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char[] f403a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f400a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f402b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char f401a = 0;
    private int b = 0;
    private int a = 1;
    private int c = 1;
    private int d = -1;

    public g(String str) {
        this.f403a = str.toCharArray();
    }

    public final void a() {
        if (this.f402b || this.b <= 0) {
            return;
        }
        this.b--;
        this.a--;
        this.f402b = true;
        this.f400a = false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final char m185a() {
        char c;
        char c2;
        if (this.f402b) {
            this.f402b = false;
            c2 = this.f401a;
        } else {
            if (this.f403a == null || this.d + 1 >= this.f403a.length) {
                c = 0;
            } else {
                this.d++;
                c = this.f403a[this.d];
            }
            c2 = c;
            if (c <= 0) {
                this.f400a = true;
                c2 = 0;
            }
        }
        this.b++;
        if (this.f401a == '\r') {
            this.c++;
            this.a = c2 == '\n' ? 0 : 1;
        } else if (c2 == '\n') {
            this.c++;
            this.a = 0;
        } else {
            this.a++;
        }
        this.f401a = c2;
        return this.f401a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private String m186a() {
        char[] cArr = new char[4];
        for (int r6 = 0; r6 < 4; r6++) {
            cArr[r6] = m185a();
            if (this.f400a && !this.f402b) {
                return null;
            }
        }
        return new String(cArr);
    }

    public final char b() {
        char cM185a;
        do {
            cM185a = m185a();
            if (cM185a == 0) {
                break;
            }
        } while (cM185a <= ' ');
        return cM185a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final Object m187a() {
        char cB = b();
        char cM185a = cB;
        switch (cB) {
            case '\"':
            case '\'':
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char cM185a2 = m185a();
                    switch (cM185a2) {
                        case 0:
                        case '\n':
                        case '\r':
                            return null;
                        case '\\':
                            char cM185a3 = m185a();
                            switch (cM185a3) {
                                case '\"':
                                case '\'':
                                case '/':
                                case '\\':
                                    stringBuffer.append(cM185a3);
                                    break;
                                case 'b':
                                    stringBuffer.append('\b');
                                    break;
                                case 'f':
                                    stringBuffer.append('\f');
                                    break;
                                case 'n':
                                    stringBuffer.append('\n');
                                    break;
                                case 'r':
                                    stringBuffer.append('\r');
                                    break;
                                case 't':
                                    stringBuffer.append('\t');
                                    break;
                                case 'u':
                                    stringBuffer.append((char) aj.a(m186a()));
                                    break;
                                default:
                                    return null;
                            }
                            break;
                        default:
                            if (cM185a2 == cM185a) {
                                return stringBuffer.toString();
                            }
                            stringBuffer.append(cM185a2);
                            break;
                    }
                }
                break;
            case '[':
                a();
                return new d(this);
            case '{':
                a();
                return new f(this);
            default:
                StringBuffer stringBuffer2 = new StringBuffer();
                while (cM185a >= ' ' && ",:]}/\\\"[{;=#".indexOf(cM185a) < 0) {
                    stringBuffer2.append(cM185a);
                    cM185a = m185a();
                }
                a();
                String strTrim = stringBuffer2.toString().trim();
                if (strTrim.compareTo("") == 0) {
                    return null;
                }
                return f.m175a(strTrim);
        }
    }

    public final String toString() {
        return new StringBuffer().append(" at ").append(this.b).append(" [character ").append(this.a).append(" line ").append(this.c).append("]").toString();
    }
}
