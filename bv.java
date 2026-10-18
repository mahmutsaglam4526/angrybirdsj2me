package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bv.class */
public class bv extends bm {
    protected int c = -1;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f141c = new int[4];

    @Override // defpackage.bo
    public void c() {
        super.c();
        this.c = -1;
    }

    @Override // defpackage.bm, defpackage.bo
    public final void a(boolean z) {
        super.a(z);
        bo boVarA = a();
        if (boVarA != null) {
            boVarA.a(z);
        }
    }

    public final bo a() {
        return a(this.c);
    }

    protected final void a(int r4) {
        bo boVarA;
        if (this.c >= 0 && (boVarA = a(this.c)) != null) {
            boVarA.a(false);
        }
        this.c = r4;
        bo boVarA2 = a(this.c);
        if (boVarA2 != null) {
            boVarA2.a(true);
        }
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: a */
    public int mo92a(int r5, int r6) {
        int r0;
        int r8 = b();
        do {
            r8--;
            bo boVarA = a(r8);
            if (boVarA == null) {
                return 0;
            }
            r0 = boVarA.mo92a(r5, r6);
        } while (r0 == 0);
        a(r8);
        return r0;
    }

    @Override // defpackage.bo
    public final int a(int r6, int r7, int r8) {
        int r0;
        int r1;
        int r2 = r7 - ((bo) this).b[0];
        int r3 = r8 - ((bo) this).b[1];
        bo boVarA = a();
        if (boVarA != null && boVarA.a() && this.c != -1 && (r1 = boVarA.a(r6, r2, r3)) > 0) {
            if (r1 >= 2) {
                a(-1);
            }
            return r1;
        }
        int r10 = b();
        while (true) {
            r10--;
            bo boVarA2 = a(r10);
            if (boVarA2 == null) {
                int r11 = -1;
                int r12 = Integer.MAX_VALUE;
                int r13 = b();
                while (true) {
                    r13--;
                    bo boVarA3 = a(r13);
                    if (boVarA3 == null) {
                        break;
                    }
                    if (boVarA3.a() && !boVarA3.m91a(r2, r3) && ah.a(boVarA3.b, r2, r3, boVarA3.mo88a())) {
                        int r4 = boVarA3.b[0] + (boVarA3.b[2] / 2);
                        int r5 = boVarA3.b[1] + (boVarA3.b[3] / 2);
                        int r9 = q.b(((r4 - r2) * (r4 - r2)) + ((r5 - r3) * (r5 - r3)));
                        if (r9 < r12) {
                            r12 = r9;
                            r11 = r13;
                        }
                    }
                }
                if (r11 >= 0) {
                    bo boVarA4 = a(r11);
                    if (boVarA4 == null) {
                        return 0;
                    }
                    int r14 = boVarA4.a(r6, r2, r3);
                    if (r14 != 0) {
                        a(r11);
                        return r14;
                    }
                }
                a(-1);
                return 0;
            }
            if (boVarA2.m91a(r2, r3) && boVarA2.a() && (r0 = boVarA2.a(r6, r2, r3)) != 0) {
                a(r10);
                return r0;
            }
        }
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: a */
    public final boolean mo94a(int[] r7) {
        bo boVarA;
        if (this.c < 0 || (boVarA = a()) == null || !boVarA.mo94a(r7)) {
            return false;
        }
        r7[0] = r7[0] + ((bo) this).b[0];
        r7[1] = r7[1] + ((bo) this).b[1];
        return true;
    }

    @Override // defpackage.bo
    public final void b(int r5, int r6) {
        if (!a()) {
            return;
        }
        au.m49a();
        au.a(f141c);
        int[] r0 = f141c;
        int[] r1 = f141c;
        int[] r2 = f141c;
        int[] r3 = f141c;
        int[] r4 = f141c;
        int[] r7 = f141c;
        int r8 = ((bo) this).b[0] + r5;
        int r9 = ((bo) this).b[1] + r6;
        int r10 = 0;
        while (true) {
            bo boVarA = a(r10);
            if (boVarA == null) {
                return;
            }
            boVarA.b(r8, r9);
            r10++;
        }
    }
}
