package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ei.class */
public final class ei {
    public ej a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f307a;
    private ej b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f308b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final m f309a = new m();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ap[] f310a = new ap[4];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap f311a = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dw f312a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dx f313a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final ap f314b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final ap f315c;
    private final ap d;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final dx f316b;

    public ei() {
        new dx();
        new ga();
        this.f314b = new ap();
        this.f315c = new ap();
        this.d = new ap();
        this.f316b = new dx();
        new ap();
        this.a = null;
        this.f307a = 0;
        this.f308b = 0;
        this.c = 0;
        this.b = null;
        for (int r6 = 0; r6 < this.f310a.length; r6++) {
            this.f310a[r6] = new ap();
        }
    }

    public final void a(int r5) {
        if (this.a == null) {
            return;
        }
        for (int r7 = 0; r7 < r5; r7++) {
            ej ejVar = this.a;
            int r0 = 0;
            while (true) {
                int r8 = r0;
                if (!ejVar.a()) {
                    ejVar = ((this.c >> r8) & 1) == 0 ? ejVar.b : ejVar.c;
                    r0 = (r8 + 1) & 31;
                }
            }
            this.c++;
            c(ejVar);
            b(ejVar);
        }
    }

    public final boolean a(ej ejVar, int r6) {
        if (ejVar == null) {
            return true;
        }
        dx dxVar = this.f313a;
        dx dxVar2 = ejVar.a;
        boolean z = dxVar2.a.f60a - dxVar.b.f60a <= 0.0f && dxVar2.a.b - dxVar.b.b <= 0.0f && dxVar.a.f60a - dxVar2.b.f60a <= 0.0f && dxVar.a.b - dxVar2.b.b <= 0.0f;
        if (!z) {
            return true;
        }
        if (ejVar.a()) {
            return this.f312a.mo162a(ejVar);
        }
        int r7 = r6 + 1;
        return a(ejVar.b, r7) && a(ejVar.c, r7 + 1);
    }

    public final int a() {
        return a(this.a);
    }

    private final int a(ej ejVar) {
        if (ejVar == null) {
            return 0;
        }
        return 1 + q.c(a(ejVar.b), a(ejVar.c));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final ej m163a() {
        if (this.f309a.a == 0) {
            this.f309a.a(new ej());
            this.f309a.a(new ej());
            this.f309a.a(new ej());
            this.f309a.a(new ej());
            this.f309a.a(new ej());
            this.f309a.a(new ej());
        }
        ej ejVar = (ej) this.f309a.a();
        ejVar.f318a = null;
        ejVar.b = null;
        ejVar.c = null;
        ejVar.f317a = null;
        ejVar.f319a = az.a(Integer.MAX_VALUE);
        this.f307a++;
        return ejVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m164a(ej ejVar) {
        this.f309a.a(ejVar);
        this.f307a--;
    }

    public final void b(ej ejVar) {
        this.f308b++;
        if (this.a == null) {
            this.a = ejVar;
            ejVar.f318a = null;
            return;
        }
        ejVar.a.a(this.f314b);
        ej ejVar2 = this.a;
        while (!ejVar2.a()) {
            ej ejVar3 = ejVar2.b;
            ejVar2 = ejVar2.c;
            ejVar3.a.a(this.f315c);
            ejVar2.a.a(this.d);
            this.f315c.c(this.f314b);
            this.f315c.c();
            this.d.c(this.f314b);
            this.d.c();
            if (this.f315c.f60a + this.f315c.b < this.d.f60a + this.d.b) {
                ejVar2 = ejVar3;
            }
        }
        ej ejVar4 = ejVar2.f318a;
        ej ejVarM163a = m163a();
        ej ejVar5 = ejVarM163a;
        ejVarM163a.f318a = ejVar4;
        ejVar5.f317a = null;
        ejVar5.a.a(ejVar.a, ejVar2.a);
        if (ejVar4 == null) {
            ejVar5.b = ejVar2;
            ejVar5.c = ejVar;
            ejVar2.f318a = ejVar5;
            ejVar.f318a = ejVar5;
            this.a = ejVar5;
            return;
        }
        if (ejVar2.f318a.b == ejVar2) {
            ejVar4.b = ejVar5;
        } else {
            ejVar4.c = ejVar5;
        }
        ejVar5.b = ejVar2;
        ejVar5.c = ejVar;
        ejVar2.f318a = ejVar5;
        ejVar.f318a = ejVar5;
        while (!ejVar4.a.m156a(ejVar5.a)) {
            ejVar4.a.a(ejVar4.b.a, ejVar4.c.a);
            ejVar5 = ejVar4;
            ej ejVar6 = ejVar4.f318a;
            ejVar4 = ejVar6;
            if (ejVar6 == null) {
                return;
            }
        }
    }

    public final void c(ej ejVar) {
        if (ejVar == this.a) {
            this.a = null;
            if (this.b == ejVar) {
                this.b = null;
                return;
            }
            return;
        }
        ej ejVar2 = ejVar.f318a;
        ej ejVar3 = ejVar2.f318a;
        ej ejVar4 = ejVar2.b == ejVar ? ejVar2.c : ejVar2.b;
        if (ejVar3 != null) {
            if (ejVar3.b == ejVar2) {
                ejVar3.b = ejVar4;
            } else {
                ejVar3.c = ejVar4;
            }
            ejVar4.f318a = ejVar3;
            m164a(ejVar2);
            while (ejVar3 != null) {
                this.f316b.a(ejVar3.a);
                ejVar3.a.a(ejVar3.b.a, ejVar3.c.a);
                if (this.f316b.m156a(ejVar3.a)) {
                    break;
                } else {
                    ejVar3 = ejVar3.f318a;
                }
            }
        } else {
            this.a = ejVar4;
            ejVar4.f318a = null;
            m164a(ejVar2);
        }
        if (this.b == ejVar) {
            this.b = this.a;
        }
    }
}
