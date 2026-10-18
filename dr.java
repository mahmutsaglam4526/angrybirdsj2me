package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dr.class */
public final class dr {
    public static cq a;

    public static boolean a(String str) {
        a = new cq();
        f fVar = new f(str);
        fVar.m173a("id");
        f fVarM172a = fVar.m172a("counts");
        f fVarM172a2 = fVar.m172a("world");
        d dVarM171a = fVar.m171a("camera");
        for (int r11 = 0; r11 < dVarM171a.m135a(); r11++) {
            f fVarA = dVarM171a.a(r11);
            String strM173a = fVarA.m173a("id");
            double[] dArr = {fVarA.a("left"), fVarA.a("top"), fVarA.a("right"), fVarA.a("bottom")};
            double[] dArr2 = {fVarA.a("x"), fVarA.a("y")};
            float f = (ac.a / 8.0f) / ((float) (dArr[2] - dArr[0]));
            float f2 = (ac.b / 8.0f) / ((float) (dArr[3] - dArr[1]));
            if (strM173a.compareTo("Castle") == 0) {
                a.a = (float) dArr2[0];
                a.b = (float) dArr2[1];
                a.c = Math.min(f, f2);
            } else if (strM173a.compareTo("Slingshot") == 0) {
                a.d = (float) dArr2[0];
                a.e = (float) dArr2[1];
                a.f = Math.min(f, f2);
            }
        }
        int r0 = fVarM172a.m170a("birds");
        for (int r10 = 1; r10 <= r0; r10++) {
            f fVarM172a3 = fVarM172a2.m172a(new StringBuffer().append("bird_").append(r10).toString());
            String strM173a2 = fVarM172a3.m173a("id");
            double dA = fVarM172a3.a("x");
            double dA2 = fVarM172a3.a("y");
            fVarM172a3.a("angle");
            short sM155a = m155a(strM173a2);
            if (sM155a != -1) {
                a.a(sM155a, (float) dA, (float) dA2);
            }
        }
        int r1 = fVarM172a.m170a("blocks");
        for (int r12 = 1; r12 <= r1; r12++) {
            f fVarM172a4 = fVarM172a2.m172a(new StringBuffer().append("block_").append(r12).toString());
            String strM173a3 = fVarM172a4.m173a("id");
            double dA3 = fVarM172a4.a("x");
            double dA4 = fVarM172a4.a("y");
            double dA5 = fVarM172a4.a("angle");
            short sM155a2 = m155a(strM173a3);
            if (sM155a2 != -1) {
                a.a(sM155a2, (float) dA3, (float) dA4, (float) dA5);
            }
        }
        fVar.m173a("theme");
        int[] r2 = {fVar.m170a("scoreEagle"), fVar.m170a("scoreSilver"), fVar.m170a("scoreGold")};
        a.f196d = r2[1];
        a.f197e = r2[2];
        a.b();
        a.a();
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final short m155a(String str) {
        short s = -1;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= 94) {
                break;
            }
            if ((cx.f234a != null ? cx.f234a[s3] : "").compareTo(str) == 0) {
                s = s3;
                break;
            }
            s2 = (short) (s3 + 1);
        }
        if (s == -1) {
            new StringBuffer().append("Could not translate name: ").append(str).append(" into typeIndex").toString();
        }
        return s;
    }
}
