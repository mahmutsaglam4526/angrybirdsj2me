package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dn.class */
public class dn extends bu {
    private static int d = -1;
    private int e;

    public dn(int r5, int r6) {
        super(r5, r6);
    }

    @Override // defpackage.bt, defpackage.bo
    public int a(int r6, int r7, int r8) {
        int r9 = -1;
        if (r6 == 65 && ((bt) this).f140c) {
            r9 = 0;
        }
        int r0 = super.a(r6, r7, r8);
        if (r6 == 64 && ((bt) this).f140c) {
            r9 = this.e;
        }
        if (r9 > 0 && ce.a) {
            b(r9);
        }
        return r0;
    }

    protected static void b(int r3) {
        if (r3 > 0) {
            if (d < 0) {
                d = ay.a();
            }
            ay.a(d, r3);
            ay.b(d);
        }
    }

    public static dn a(int r5, int r6) {
        dn dnVar = new dn(r5, r6);
        a(dnVar);
        return dnVar;
    }

    public static void a(dn dnVar) {
        if (((bt) dnVar).c == 67) {
            dnVar.e = 1;
        } else if (((bt) dnVar).c != 68) {
            dnVar.e = 2;
        }
    }
}
