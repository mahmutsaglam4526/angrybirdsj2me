package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bo.class */
public class bo {
    public final int[] b = new int[4];
    public x a;

    public final int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.a;
    }

    public final bo a(int r4) {
        if (this.a == null || r4 < 0 || r4 >= this.a.a) {
            return null;
        }
        return (bo) this.a.a(r4);
    }

    public void a(bo boVar) {
        if (this.a == null) {
            this.a = new x();
        }
        x xVar = this.a;
        if (xVar.a == xVar.f430a.length) {
            Object[] objArr = new Object[xVar.a << 1];
            az.a(xVar.f430a, 0, objArr, 0, xVar.a);
            xVar.f430a = objArr;
        }
        Object[] objArr2 = xVar.f430a;
        int r2 = xVar.a;
        xVar.a = r2 + 1;
        objArr2[r2] = boVar;
        int r0 = xVar.a;
    }

    public void c() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public final void a(int[] r7) {
        this.b[0] = aa.a(r7[2], this.b[2], 32768);
        this.b[1] = aa.a(r7[3], this.b[3], 32768);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void mo89b() {
        int r5 = 0;
        while (true) {
            bo boVarA = a(r5);
            if (boVarA == null) {
                return;
            }
            boVarA.mo89b();
            r5++;
        }
    }

    public void a(int r5, int r6) {
        this.b[2] = r5;
        this.b[3] = r6;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m90a(int r5) {
        return this.b[r5 + 2];
    }

    public final void a(int[] r6, int r7, int r8) {
        r6[0] = this.b[0] + r7;
        r6[1] = this.b[1] + r8;
        r6[2] = this.b[2];
        r6[3] = this.b[3];
    }

    /* JADX INFO: renamed from: a */
    public int mo88a() {
        return 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m91a(int r5, int r6) {
        int r0 = r5 - this.b[0];
        int r1 = r6 - this.b[1];
        return r0 >= 0 && r1 >= 0 && r0 < this.b[2] && r1 < this.b[3];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int mo92a(int r3, int r4) {
        return 0;
    }

    public int a(int r3, int r4, int r5) {
        return 0;
    }

    public void d() {
        if (!a()) {
            return;
        }
        int r5 = 0;
        while (true) {
            bo boVarA = a(r5);
            if (boVarA == null) {
                return;
            }
            boVarA.d();
            r5++;
        }
    }

    public void b(int r6, int r7) {
        if (!a()) {
            return;
        }
        au.m49a();
        int r9 = 0;
        while (true) {
            bo boVarA = a(r9);
            if (boVarA == null) {
                return;
            }
            boVarA.b(this.b[0] + r6, this.b[1] + r7);
            r9++;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean mo93b() {
        return false;
    }

    public void a(boolean z) {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo94a(int[] r6) {
        if (!mo93b()) {
            return false;
        }
        a(r6, 0, 0);
        return true;
    }

    public boolean a() {
        return true;
    }
}
