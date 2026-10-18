package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:d.class */
public class d {
    private m a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Class f239a;

    public d() {
        a();
    }

    private void a() {
        this.a = new m();
    }

    public d(g gVar) {
        a(gVar);
    }

    /* JADX WARN: Switch 'out' block B:8:0x001b for B:13:0x004a already processed. Defaulting to fallback option. */
    private void a(g gVar) {
        a();
        if (gVar.b() == '[' && gVar.b() != ']') {
            gVar.a();
            while (true) {
                if (gVar.b() == ',') {
                    gVar.a();
                    this.a.a(f.f355a);
                } else {
                    gVar.a();
                    this.a.a(gVar.m187a());
                }
                switch (gVar.b()) {
                    case ',':
                    case ';':
                        if (gVar.b() == ']') {
                            return;
                        } else {
                            gVar.a();
                        }
                        break;
                    case ']':
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final f a(int r5) {
        Class<?> clsM136a;
        Object obj = (r5 < 0 || r5 >= this.a.a) ? null : this.a.f422a[r5];
        Object obj2 = obj;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj2.getClass();
        if (f239a == null) {
            clsM136a = m136a("f");
            f239a = clsM136a;
        } else {
            clsM136a = f239a;
        }
        if (cls == clsM136a) {
            return (f) obj2;
        }
        return null;
    }

    private String a(String str) {
        int r0 = this.a.a;
        StringBuffer stringBuffer = new StringBuffer();
        for (int r8 = 0; r8 < r0; r8++) {
            if (r8 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(f.a(this.a.f422a[r8]));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m135a() {
        return this.a.a;
    }

    public String toString() {
        return new StringBuffer().append('[').append(a(",")).append(']').toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Class m136a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
