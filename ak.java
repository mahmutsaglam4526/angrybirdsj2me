package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ak.class */
public final class ak {
    public eh a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fe f22a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f23a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ds f24a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public du f25a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private an f26a;

    public ak() {
    }

    public ak(an anVar) {
        this.f22a = null;
        this.f23a = 0;
        this.f24a = new ds();
        this.f25a = null;
        this.a = new eh();
        this.f26a = anVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0168  */
    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
    /* JADX WARN: Code duplicated, block: B:39:0x0187  */
    /* JADX WARN: Code duplicated, block: B:40:0x019e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0217  */
    /* JADX WARN: Code duplicated, block: B:49:0x0260  */
    public final void a() {
        ek ekVar;
        fi fiVar;
        ax axVar;
        fe feVar;
        fe feVar2;
        am amVar;
        am amVar2;
        eh ehVar = this.a;
        ehVar.c = 0;
        for (int r7 = 0; r7 < ehVar.b; r7++) {
            ehVar.f306a = ehVar.f304a[r7];
            if (ehVar.f306a != null) {
                ei eiVar = ehVar.a;
                dx dxVar = ehVar.f306a.a;
                eiVar.f312a = ehVar;
                eiVar.f313a = dxVar;
                eiVar.a(eiVar.a, 1);
            }
        }
        ehVar.b = 0;
        ek.a(ehVar.f305a, 0, ehVar.c);
        int r8 = 0;
        while (r8 < ehVar.c) {
            ek ekVar2 = ehVar.f305a[r8];
            Object obj = ekVar2.a.f317a;
            Object obj2 = ekVar2.b.f317a;
            ev evVar = (ev) obj;
            ev evVar2 = (ev) obj2;
            am amVar3 = evVar.f335a;
            am amVar4 = evVar2.f335a;
            if (amVar3 != amVar4) {
                fh fhVar = amVar4.f37a;
                while (true) {
                    fh fhVar2 = fhVar;
                    if (fhVar2 == null) {
                        if (!amVar4.a(amVar3)) {
                            break;
                        }
                        if (this.f24a == null) {
                            an anVar = this.f26a;
                            fiVar = anVar.f51a[evVar.f336a.b][evVar2.f336a.b];
                            axVar = fiVar.a;
                            if (axVar != null) {
                                feVar = null;
                            } else if (fiVar.f379a) {
                                fe feVar3 = (fe) axVar.a();
                                feVar3.a(evVar, evVar2);
                                feVar = feVar3;
                            } else {
                                fe feVar4 = (fe) axVar.a();
                                feVar4.a(evVar2, evVar);
                                feVar = feVar4;
                            }
                            feVar2 = feVar;
                            ev evVarM181a = feVar.m181a();
                            ev evVarM182b = feVar2.m182b();
                            amVar = evVarM181a.f335a;
                            amVar2 = evVarM182b.f335a;
                            feVar2.f357a = null;
                            feVar2.b = this.f22a;
                            if (this.f22a != null) {
                                this.f22a.f357a = feVar2;
                            }
                            this.f22a = feVar2;
                            feVar2.f358a.f377a = feVar2;
                            feVar2.f358a.a = amVar2;
                            feVar2.f358a.f378a = null;
                            feVar2.f358a.b = amVar.f37a;
                            if (amVar.f37a != null) {
                                amVar.f37a.f378a = feVar2.f358a;
                            }
                            amVar.f37a = feVar2.f358a;
                            feVar2.f359b.f377a = feVar2;
                            feVar2.f359b.a = amVar;
                            feVar2.f359b.f378a = null;
                            feVar2.f359b.b = amVar2.f37a;
                            if (amVar2.f37a != null) {
                                amVar2.f37a.f378a = feVar2.f359b;
                            }
                            amVar2.f37a = feVar2.f359b;
                            this.f23a++;
                            break;
                        }
                        ds dsVar = this.f24a;
                        if (!ds.a(evVar, evVar2)) {
                            break;
                        }
                        an anVar2 = this.f26a;
                        fiVar = anVar2.f51a[evVar.f336a.b][evVar2.f336a.b];
                        axVar = fiVar.a;
                        if (axVar != null) {
                            feVar = null;
                        } else if (fiVar.f379a) {
                            fe feVar5 = (fe) axVar.a();
                            feVar5.a(evVar, evVar2);
                            feVar = feVar5;
                        } else {
                            fe feVar6 = (fe) axVar.a();
                            feVar6.a(evVar2, evVar);
                            feVar = feVar6;
                        }
                        feVar2 = feVar;
                        ev evVarM181a2 = feVar.m181a();
                        ev evVarM182b2 = feVar2.m182b();
                        amVar = evVarM181a2.f335a;
                        amVar2 = evVarM182b2.f335a;
                        feVar2.f357a = null;
                        feVar2.b = this.f22a;
                        if (this.f22a != null) {
                            this.f22a.f357a = feVar2;
                        }
                        this.f22a = feVar2;
                        feVar2.f358a.f377a = feVar2;
                        feVar2.f358a.a = amVar2;
                        feVar2.f358a.f378a = null;
                        feVar2.f358a.b = amVar.f37a;
                        if (amVar.f37a != null) {
                            amVar.f37a.f378a = feVar2.f358a;
                        }
                        amVar.f37a = feVar2.f358a;
                        feVar2.f359b.f377a = feVar2;
                        feVar2.f359b.a = amVar;
                        feVar2.f359b.f378a = null;
                        feVar2.f359b.b = amVar2.f37a;
                        if (amVar2.f37a != null) {
                            amVar2.f37a.f378a = feVar2.f359b;
                        }
                        amVar2.f37a = feVar2.f359b;
                        this.f23a++;
                        break;
                    }
                    if (fhVar2.a == amVar3) {
                        ev evVarM181a3 = fhVar2.f377a.m181a();
                        ev evVarM182b3 = fhVar2.f377a.m182b();
                        if ((evVarM181a3 == evVar && evVarM182b3 == evVar2) || (evVarM181a3 == evVar2 && evVarM182b3 == evVar)) {
                            break;
                        }
                    }
                    fhVar = fhVar2.b;
                }
            }
            do {
                r8++;
                if (r8 >= ehVar.c) {
                    break;
                }
                ekVar = ehVar.f305a[r8];
                if (ekVar.a != ekVar2.a) {
                    break;
                }
            } while (ekVar.b == ekVar2.b);
        }
        ehVar.a.a(2);
    }

    public final void a(fe feVar) {
        ev evVarM181a = feVar.m181a();
        ev evVarM182b = feVar.m182b();
        am amVar = evVarM181a.f335a;
        am amVar2 = evVarM182b.f335a;
        if (this.f25a != null && feVar.m179a()) {
            du duVar = this.f25a;
        }
        if (feVar.f357a != null) {
            feVar.f357a.b = feVar.b;
        }
        if (feVar.b != null) {
            feVar.b.f357a = feVar.f357a;
        }
        if (feVar == this.f22a) {
            this.f22a = feVar.b;
        }
        if (feVar.f358a.f378a != null) {
            feVar.f358a.f378a.b = feVar.f358a.b;
        }
        if (feVar.f358a.b != null) {
            feVar.f358a.b.f378a = feVar.f358a.f378a;
        }
        if (feVar.f358a == amVar.f37a) {
            amVar.f37a = feVar.f358a.b;
        }
        if (feVar.f359b.f378a != null) {
            feVar.f359b.f378a.b = feVar.f359b.b;
        }
        if (feVar.f359b.b != null) {
            feVar.f359b.b.f378a = feVar.f359b.f378a;
        }
        if (feVar.f359b == amVar2.f37a) {
            amVar2.f37a = feVar.f359b.b;
        }
        an anVar = this.f26a;
        if (feVar.f362a.f276b > 0) {
            feVar.m181a().f335a.a(true);
            feVar.m182b().f335a.a(true);
        }
        ax axVar = anVar.f51a[feVar.m181a().f336a.b][feVar.m182b().f336a.b].a;
        feVar.a();
        axVar.f89a.a(feVar);
        this.f23a--;
    }
}
