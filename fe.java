package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:fe.class */
public abstract class fe {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fe f357a;
    public fe b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fh f358a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public fh f359b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ev f360a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public ev f361b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public eb f362a = new eb();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f363a;

    protected fe() {
        this.f358a = null;
        this.f359b = null;
        this.f358a = new fh();
        this.f359b = new fh();
    }

    public void a(ev evVar, ev evVar2) {
        this.a = 0;
        this.f360a = evVar;
        this.f361b = evVar2;
        this.f362a.f276b = 0;
        this.f357a = null;
        this.b = null;
        this.f358a.f377a = null;
        this.f358a.f378a = null;
        this.f358a.b = null;
        this.f358a.a = null;
        this.f359b.f377a = null;
        this.f359b.f378a = null;
        this.f359b.b = null;
        this.f359b.a = null;
        this.f363a = 0.0f;
    }

    public final void a() {
        this.a = 0;
        this.f360a = null;
        this.f361b = null;
        this.f362a.f276b = 0;
        this.f357a = null;
        this.b = null;
        this.f358a.f377a = null;
        this.f358a.f378a = null;
        this.f358a.b = null;
        this.f358a.a = null;
        this.f359b.f377a = null;
        this.f359b.f378a = null;
        this.f359b.b = null;
        this.f359b.a = null;
        this.f363a = 0.0f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final eb m178a() {
        return this.f362a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m179a() {
        return (this.a & 2) == 2;
    }

    public final void a(boolean z) {
        if (z) {
            this.a |= 4;
        } else {
            this.a &= -5;
        }
    }

    public final boolean b() {
        return (this.a & 4) == 4;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final fe m180a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final ev m181a() {
        return this.f360a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final ev m182b() {
        return this.f361b;
    }

    public abstract void a(eb ebVar, es esVar, es esVar2);

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m183b() {
        this.a |= 8;
    }

    public final void a(du duVar) {
        eb ebVarA = eb.a();
        ebVarA.a(this.f362a);
        this.a |= 4;
        boolean z = (this.a & 2) == 2;
        ev evVar = this.f360a;
        ev evVar2 = this.f361b;
        am amVar = this.f360a.f335a;
        am amVar2 = this.f361b.f335a;
        a(this.f362a, amVar.f27a, amVar2.f27a);
        boolean z2 = this.f362a.f276b > 0;
        for (int r13 = 0; r13 < this.f362a.f276b; r13++) {
            fz fzVar = this.f362a.f273a[r13];
            fzVar.f398a = 0.0f;
            fzVar.b = 0.0f;
            fx fxVar = fzVar.f399a;
            for (int r15 = 0; r15 < ebVarA.f276b; r15++) {
                fz fzVar2 = ebVarA.f273a[r15];
                fx fxVar2 = fzVar2.f399a;
                fy fyVar = fxVar.a;
                fy fyVar2 = fxVar2.a;
                if (fyVar.a == fyVar2.a && fyVar.b == fyVar2.b && fyVar.c == fyVar2.c && fyVar.d == fyVar2.d) {
                    fzVar.f398a = fzVar2.f398a;
                    fzVar.b = fzVar2.b;
                    break;
                }
            }
        }
        if (z2 != z) {
            amVar.a(true);
            amVar2.a(true);
        }
        if (z2) {
            this.a |= 2;
        } else {
            this.a &= -3;
        }
        if (duVar == null) {
            eb.m160a();
            return;
        }
        if (!z && z2) {
            duVar.a(this);
        }
        if (z2) {
            duVar.b(this);
        }
        eb.m160a();
    }
}
